package br.com.fiap.main;

import br.com.fiap.beans.CategoriaTutorial;
import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.CategoriaDAO;
import br.com.fiap.dao.UsuarioDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteAtualizarCategoria {
    static String texto (String t) {return JOptionPane.showInputDialog(t);}
    static int inteiro (String i) {return Integer.parseInt(JOptionPane.showInputDialog(i));}
    static double real (String r) {return Double.parseDouble(JOptionPane.showInputDialog(r));}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CategoriaDAO categoriaDAO = new CategoriaDAO();

        CategoriaTutorial objCategoria = new CategoriaTutorial();

        objCategoria.setId_categoria(inteiro("Informe o Id da categoria que será atualizada"));
        objCategoria.setNome(texto("Informe o nome da categoria que sera atualizada"));
        objCategoria.setDescricaoCategoriaTutorial(texto("Informe o nome da categoria que sera atualizada"));


        System.out.println(categoriaDAO.atualizarCategoria(objCategoria));
    }
}
