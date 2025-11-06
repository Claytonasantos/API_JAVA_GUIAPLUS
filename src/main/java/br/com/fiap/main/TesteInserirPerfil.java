package br.com.fiap.main;

import br.com.fiap.beans.Perfil;
import br.com.fiap.dao.PerfilDAO;

import javax.swing.*;
import java.sql.SQLException;


public class TesteInserirPerfil {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PerfilDAO perfilDAO = new PerfilDAO();
        Perfil objPerfil = new Perfil();

        objPerfil.setDescricaoPerfil(texto("Descrição do perfil"));
        objPerfil.setModoAcesso(texto("Modo de acesso:"));



        System.out.println(perfilDAO.inserirPerfil(objPerfil));
    }
}
