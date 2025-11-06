package br.com.fiap.beans;

public class Tutorial_video {
    private int id_tutorial;
    private String titulo;
    private String url;
    private String tipo_tutorial;
    private CategoriaTutorial categoria;

    public Tutorial_video() {
    }

    public Tutorial_video(int id_tutorial, String titulo, String url, String tipo_tutorial) {
        this.id_tutorial = id_tutorial;
        this.titulo = titulo;
        this.url = url;
        this.tipo_tutorial = tipo_tutorial;
    }

    public int getId_tutorial() {
        return id_tutorial;
    }

    public void setId_tutorial(int id_tutorial) {
        this.id_tutorial = id_tutorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTipo_tutorial() {
        return tipo_tutorial;
    }

    public void setTipo_tutorial(String tipo_tutorial) {
        this.tipo_tutorial = tipo_tutorial;
    }

    public CategoriaTutorial getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaTutorial categoria) {
        this.categoria = categoria;
    }
}
