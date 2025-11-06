package br.com.fiap.beans;

public class CategoriaTutorial {
    private int id_categoria;
    private String nome;
    private String descricaoCategoriaTutorial;

    public CategoriaTutorial() {
    }

    public CategoriaTutorial(int id_categoria, String nome, String descricaoCategoriaTutorial) {
        this.id_categoria = id_categoria;
        this.nome = nome;
        this.descricaoCategoriaTutorial = descricaoCategoriaTutorial;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoCategoriaTutorial() {
        return descricaoCategoriaTutorial;
    }

    public void setDescricaoCategoriaTutorial(String descricaoCategoriaTutorial) {
        this.descricaoCategoriaTutorial = descricaoCategoriaTutorial;
    }
}
