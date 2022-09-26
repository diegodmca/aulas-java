package UtilizandoPersistenciaBD;

import java.util.List;

public class Menu {
    public static void main(String[] args) {
        PessoaConnector pc = new PessoaConnector();
        Connection con = new Connection();
        try {
            //---------- INSERIR DADOS

//			Pessoa p1 = new Pessoa(1,"Diego", "diego@outlook.com");
//			Pessoa p2 = new Pessoa(2,"Maria", "maria@gmail.com");
//            Pessoa p3 = new Pessoa(3,"Jose", "jose@gmail.com");
//			pd.incluirPessoa(p1);
//			pd.incluirPessoa(p2);
//            pd.incluirPessoa(p3);
//            System.out.println("Informacoes inseridas com sucesso");


            //------------ ALTERAR UM REGISTRO

                Pessoa pes = pc.consultarPessoaIndividual(2);
                if (pes != null) {
                    pes.setEmail("maria@gmail.com");
                    pc.alterarPessoa(pes);
                    System.out.println("Informacoes alteradas com sucesso");
                } else {
                    System.out.println("Id nao localizado");

                }

                //---------LISTA OS REGISTROS
                List<Pessoa> listaPessoas = pc.ListarPessoas();
                for(Pessoa p : listaPessoas){
                    System.out.println("Id.: " + p.getIdPessoa());
                    System.out.println("Nome : "  +p.getNomePessoa());
                    System.out.println("Email : " +p.getEmail());
                }
                System.out.println("Informacoes Listadas com sucesso");


			//----EXCLUI INFORMACOES

			Pessoa pessoa1 = pc.consultarPessoaIndividual(3);
			pc.excluirPessoa(pessoa1);
            System.out.println("Informacoes excluidas com sucesso");

        } catch (Exception e) {
            System.out.println("Error:  " + e.getMessage());
        }

    }
}
