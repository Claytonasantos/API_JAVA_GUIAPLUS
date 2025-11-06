package br.com.fiap.main;

import br.com.fiap.beans.Acesso;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.AcessoDAO;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarAcesso {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        AcessoDAO acessoDAO = new AcessoDAO();
        Acesso objAcesso = new Acesso();

        objAcesso.setId_acesso(inteiro("Informe o ID do usuário que vai ser deletado"));

        System.out.println(acessoDAO.deletarAcesso(objAcesso.getId_acesso()));
    }
}
