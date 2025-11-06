package br.com.fiap.main;

import br.com.fiap.beans.Perfil;
import br.com.fiap.dao.PerfilDAO;


import javax.swing.*;
import java.sql.SQLException;


public class TesteAtualizarPerfil {

    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PerfilDAO perfilDAO = new PerfilDAO();

        Perfil objPerfil = new Perfil();

        objPerfil.setId_perfil(inteiro("Informe o Id do perfil que será atualizado"));
        objPerfil.setDescricaoPerfil(texto("Informe a descrição do perfil que sera atualizado"));
        objPerfil.setModoAcesso(texto("Informe o modo de acesso que sera atualizado"));

        System.out.println(perfilDAO.atualizarPerfil(objPerfil));
    }
}
