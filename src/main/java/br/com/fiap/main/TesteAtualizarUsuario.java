package br.com.fiap.main;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteAtualizarUsuario {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario objUsuario = new Usuario();

        objUsuario.setId_usuario(inteiro("Informe o Id do usuario que será atualizado"));
        objUsuario.setCpf(texto("Informe o cpf do usuario que sera atualizado"));
        objUsuario.setNome(texto("Informe o nome do usuario que sera atualizado"));
        String dataStr = texto("Data de Nascimento (dd/MM/yyyy)");
        // trecho utilizado para fazer a conversão do tipo Date (porque no banco esta como date)
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dataStr);
        objUsuario.setDataNascimento(date);


        System.out.println(usuarioDAO.atualizar(objUsuario));
    }
}
