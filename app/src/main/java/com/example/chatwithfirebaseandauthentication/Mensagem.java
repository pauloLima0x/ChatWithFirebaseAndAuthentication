package com.example.chatwithfirebaseandauthentication;

import java.util.Date;

class Mensagem implements Comparable<Mensagem> {
    private String usuario;
    private Date data;
    private String texto;
    private String categoria;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Mensagem(String usuario, Date data, String texto, String categoria) {
        this.usuario = usuario;
        this.data = data;
        this.texto = texto;
        this.categoria = categoria;
    }

    public Mensagem() {
    }

    @Override
    public int compareTo(Mensagem mensagem) {
        return this.data.compareTo(mensagem.data);
    }
}