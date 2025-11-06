package br.com.fiap.main;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;


public class TesteInserirUsuario {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}



    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario objUsuario = new Usuario();

        objUsuario.setCpf(texto("CPF"));
        objUsuario.setNome(texto("Nome"));
        String dataStr = texto("Data de Nascimento (dd/MM/yyyy)");
        // trecho utilizado para fazer a conversão do tipo Date (porque no banco esta como date)
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dataStr);
        objUsuario.setDataNascimento(date);


        System.out.println(usuarioDAO.inserir(objUsuario));
    }
}
