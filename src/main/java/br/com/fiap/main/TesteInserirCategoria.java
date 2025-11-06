package br.com.fiap.main;

import br.com.fiap.beans.CategoriaTutorial;
import br.com.fiap.dao.CategoriaDAO;

import javax.swing.*;
import java.sql.SQLException;


public class TesteInserirCategoria {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        CategoriaTutorial objCategoria = new CategoriaTutorial();

        objCategoria.setNome(texto("Nome da categoria"));
        objCategoria.setDescricaoCategoriaTutorial(texto("Descrição da categoria"));

        System.out.println(categoriaDAO.inserirCategoria(objCategoria));
    }
}

