package br.com.fiap.beans;

public class Tutorial_texto {
    private int id_tutorial;
    private String tipo_tutorial;
    private String textoTutorial;
    private CategoriaTutorial categoriaTexto;

    public Tutorial_texto() {
    }

    public Tutorial_texto(int id_tutorial, String tipo_tutorial, String textoTutorial) {
        this.id_tutorial = id_tutorial;
        this.tipo_tutorial = tipo_tutorial;
        this.textoTutorial = textoTutorial;
    }

    public int getId_tutorial() {
        return id_tutorial;
    }

    public void setId_tutorial(int id_tutorial) {
        this.id_tutorial = id_tutorial;
    }

    public String getTipo_tutorial() {
        return tipo_tutorial;
    }

    public void setTipo_tutorial(String tipo_tutorial) {
        this.tipo_tutorial = tipo_tutorial;
    }

    public String getTextoTutorial() {
        return textoTutorial;
    }

    public void setTextoTutorial(String textoTutorial) {
        this.textoTutorial = textoTutorial;
    }

    public CategoriaTutorial getCategoriaTexto() {
        return categoriaTexto;
    }

    public void setCategoriaTexto(CategoriaTutorial categoriaTexto) {
        this.categoriaTexto = categoriaTexto;
    }
}
