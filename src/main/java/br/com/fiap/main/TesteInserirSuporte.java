package br.com.fiap.main;

import br.com.fiap.beans.Lembrete;
import br.com.fiap.beans.Suporte;
import br.com.fiap.dao.LembreteDAO;
import br.com.fiap.dao.SuporteDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteInserirSuporte {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SuporteDAO suporteDAO = new SuporteDAO();
        Suporte objSuporte = new Suporte();

        objSuporte.setPergunta(texto("Escreva sua duvida"));


        System.out.println(suporteDAO.inserirSuporte(objSuporte));
    }
}
