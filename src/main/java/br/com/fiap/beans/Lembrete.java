package br.com.fiap.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Lembrete {
    private int id_lembrete;
    private String nome;
    private String descricaoLembrete;
    private Date dataLembrete;


    public Lembrete() {
    }

    public Lembrete(int id_lembrete, String nome, String descricaoLembrete, Date dataLembrete) {
        this.id_lembrete = id_lembrete;
        this.nome = nome;
        this.descricaoLembrete = descricaoLembrete;
        this.dataLembrete = dataLembrete;
    }

    public int getId_lembrete() {
        return id_lembrete;
    }

    public void setId_lembrete(int id_lembrete) {
        this.id_lembrete = id_lembrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoLembrete() {
        return descricaoLembrete;
    }

    public void setDescricaoLembrete(String descricaoLembrete) {
        this.descricaoLembrete = descricaoLembrete;
    }

    public Date getDataLembrete() {
        return dataLembrete;
    }

    public void setDataLembrete(Date dataLembrete) {
        this.dataLembrete = dataLembrete;
    }

    public void lembreteConfirmado() {
        System.out.println("Lembrete adicionado com sucesso!");
    }

}
