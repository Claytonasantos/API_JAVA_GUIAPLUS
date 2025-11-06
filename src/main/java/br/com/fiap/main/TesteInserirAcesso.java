package br.com.fiap.main;

import br.com.fiap.beans.Acesso;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.AcessoDAO;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteInserirAcesso {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
        AcessoDAO acessoDAO = new AcessoDAO();
        Acesso objAcesso = new Acesso();

        String dataStr = texto("Data de Acesso (dd/MM/yyyy)");
        // trecho utilizado para fazer a conversão do tipo Date (porque no banco esta como date)
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dataStr);
        objAcesso.setDataAcesso(date);


        System.out.println(acessoDAO.inserirAcesso(objAcesso));
    }
}
