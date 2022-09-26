package UtilizandoPersistenciaBD;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaConnector extends Connection {

    public void incluirPessoa(Pessoa p) throws Exception {
        open();
        stmt = con.prepareStatement("INSERT INTO pessoa VALUES(?,?,?)");
        try {
            stmt.setInt(1, p.getIdPessoa());
            stmt.setString(2, p.getNomePessoa());
            stmt.setString(3, p.getEmail());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            stmt.close();
            close();

        }

    }
    public void alterarPessoa(Pessoa p) throws Exception {
        open();
        stmt = con.prepareStatement("UPDATE pessoa SET nomepessoa = ?, email = ? where idPessoa = ?");
        try{
            stmt.setString(1, p.getNomePessoa());
            stmt.setString(2, p.getEmail());
            stmt.setInt(3, p.getIdPessoa());
            stmt.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            stmt.close();
            close();
        }
    }

    public void excluirPessoa(Pessoa p) throws Exception {
        open();
        stmt = con.prepareStatement("DELETE FROM pessoa WHERE idPessoa = ?");
        stmt.setInt(1, p.getIdPessoa());
        stmt.execute();
        stmt.close();
        close();
    }

    public Pessoa consultarPessoaIndividual(int cod) throws Exception {
        open();
        stmt = con.prepareStatement("SELECT * FROM pessoa WHERE idPessoa = ? ");
        stmt.setInt(1, cod);
        rs = stmt.executeQuery();
        System.out.println("Consulta efetuada");

        Pessoa p = null;
            if (rs.next()) {
                p = new Pessoa();
                p.setIdPessoa(rs.getInt("idPessoa"));
                p.setNomePessoa(rs.getString("nomePessoa"));
                p.setEmail(rs.getString("email"));
            }else{
                System.out.println("Nao localizado");
            }

        close();
        System.out.println(p);
        return p;
    }

    public List<Pessoa> ListarPessoas() {
        try {
            open();
            stmt = con.prepareStatement("SELECT * FROM pessoa");
            rs = stmt.executeQuery();
            List<Pessoa> listaPessoas = new ArrayList<>();
            while (rs.next()) {
                Pessoa p = new Pessoa();
                p.setIdPessoa(rs.getInt("idPessoa"));
                p.setNomePessoa(rs.getString("nomePessoa"));
                p.setEmail(rs.getString("email"));
                listaPessoas.add(p);
            }
            close();
            return listaPessoas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
