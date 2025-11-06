package br.com.fiap.beans;

public class Suporte {
    private int id_suporte;
    private String pergunta;

    public Suporte() {
    }

    public Suporte(int id_suporte, String pergunta) {
        this.id_suporte = id_suporte;
        this.pergunta = pergunta;
    }

    public int getId_suporte() {
        return id_suporte;
    }

    public void setId_suporte(int id_suporte) {
        this.id_suporte = id_suporte;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void duvidaConfirmada() {
        System.out.println("Sua dúvida foi registrada com sucesso!");
    }

    public void recebimentoResposta() {
        System.out.println("Recebemos a pergunta: " + pergunta);
        System.out.println("Nossa equipe irá analisar e responder em breve.");
    }

}
