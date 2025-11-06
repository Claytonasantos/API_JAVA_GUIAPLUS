package br.com.fiap.main;

import br.com.fiap.beans.Lembrete;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.LembreteDAO;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteAtualizarLembrete {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException {
        LembreteDAO lembreteDAO = new LembreteDAO();

        Lembrete objLembrete = new Lembrete();

        objLembrete.setId_lembrete(inteiro("Informe o Id do lembrete que será atualizado"));
        objLembrete.setNome(texto("Informe o nome do lembrete que sera atualizado"));
        String dataStr = texto("Data do lembrete (dd/MM/yyyy)");
        // trecho utilizado para fazer a conversão do tipo Date (porque no banco esta como date)
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dataStr);
        objLembrete.setDataLembrete(date);
        objLembrete.setDescricaoLembrete(texto("Informe a descrição do lembrete que sera atualizada"));


        System.out.println(lembreteDAO.atualizarLembrete(objLembrete));
    }
}
