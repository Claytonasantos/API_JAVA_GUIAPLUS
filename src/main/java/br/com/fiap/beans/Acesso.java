package br.com.fiap.beans;

import java.time.LocalDateTime;
import java.util.Date;

public class Acesso {
    private int id_acesso;
    private Date dataAcesso;

    public Acesso() {
    }

    public Acesso(int id_acesso, Date dataAcesso) {
        this.id_acesso = id_acesso;
        this.dataAcesso = dataAcesso;
    }

    public int getId_acesso() {
        return id_acesso;
    }

    public void setId_acesso(int id_acesso) {
        this.id_acesso = id_acesso;
    }

    public Date getDataAcesso() {
        return dataAcesso;
    }

    public void setDataAcesso(Date dataAcesso) {
        this.dataAcesso = dataAcesso;
    }
}
