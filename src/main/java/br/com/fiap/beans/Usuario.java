package br.com.fiap.beans;

import java.time.LocalDate;
import java.util.Date;

public class Usuario {
    private int id_usuario;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Perfil perfil;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nome, String cpf, Date dataNascimento) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
