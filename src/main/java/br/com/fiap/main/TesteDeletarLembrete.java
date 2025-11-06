package br.com.fiap.main;

import br.com.fiap.beans.Lembrete;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.LembreteDAO;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarLembrete {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        LembreteDAO lembreteDAO = new LembreteDAO();
        Lembrete objLembrete = new Lembrete();

        objLembrete.setId_lembrete(inteiro("Informe o ID do lembrete que vai ser deletado"));

        System.out.println(lembreteDAO.deletarLembrete(objLembrete.getId_lembrete()));
    }
}
