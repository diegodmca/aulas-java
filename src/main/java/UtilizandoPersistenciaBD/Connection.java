package UtilizandoPersistenciaBD;

import java.sql.*;

public class Connection {
    java.sql.Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    CallableStatement call;

    public void open() throws Exception{
        String url = "jdbc:mysql://localhost:3306/cadastros";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado ao BD");
        } catch
            (SQLException | ClassNotFoundException ex) {
                System.out.println("Erro ao conectar no BD");
            }
        }
    public void close() throws Exception{
        con.close();
    }
    }

