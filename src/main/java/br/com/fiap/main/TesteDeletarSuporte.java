package br.com.fiap.main;

import br.com.fiap.beans.Perfil;
import br.com.fiap.beans.Suporte;
import br.com.fiap.dao.PerfilDAO;
import br.com.fiap.dao.SuporteDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarSuporte {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SuporteDAO suporteDAO = new SuporteDAO();
        Suporte objSuporte = new Suporte();

        objSuporte.setId_suporte(inteiro("Informe o ID do suporte que vai ser deletado"));

        System.out.println(suporteDAO.deletarSuporte(objSuporte.getId_suporte()));
    }
}
