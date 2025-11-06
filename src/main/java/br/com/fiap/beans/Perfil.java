package br.com.fiap.beans;

public class Perfil {
    private int id_perfil;
    private String descricaoPerfil;
    private String modoAcesso;

    public Perfil() {
    }

    public Perfil(int id_perfil, String descricaoPerfil, String modoAcesso) {
        this.id_perfil = id_perfil;
        this.descricaoPerfil = descricaoPerfil;
        this.modoAcesso = modoAcesso;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
    }

    public String getModoAcesso() {
        return modoAcesso;
    }

    public void setModoAcesso(String modoAcesso) {
        this.modoAcesso = modoAcesso;
    }
}
