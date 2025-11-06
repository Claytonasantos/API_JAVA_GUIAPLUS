package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection cn = new ConexaoFactory().conexao();

        System.out.println("Conectando com o banco de dados");

        cn.close();
    }
}
