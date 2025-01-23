package org.example.entities;

import org.example.enumeration.TipoMusica;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Concerto extends Evento{


    @Enumerated(EnumType.STRING)
    private TipoMusica genere;
    private boolean streaming;

    public Concerto() {
    }

    public Concerto(TipoMusica genere, boolean streaming) {
        this.genere = genere;
        this.streaming = streaming;
    }

    public TipoMusica getGenere() {
        return genere;
    }

    public void setGenere(TipoMusica genere) {
        this.genere = genere;
    }

    public boolean isStreaming() {
        return streaming;
    }

    public void setStreaming(boolean streaming) {
        this.streaming = streaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", streaming=" + streaming +
                '}';
    }
}
