package br.com.fiap.main;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarUsuario {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario objUsuario = new Usuario();

        objUsuario.setId_usuario(inteiro("Informe o ID do usuário que vai ser deletado"));

        System.out.println(usuarioDAO.deletar(objUsuario.getId_usuario()));

    }
}
