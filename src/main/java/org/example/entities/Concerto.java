package org.example.entities;

import org.example.enumeration.TipoEvento;
import org.example.enumeration.TipoMusica;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name ="concerti")
public class Concerto extends Evento{


    @Enumerated(EnumType.STRING)
    private TipoMusica genere;
    private boolean streaming;

    public Concerto() {
    }

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, TipoMusica genere, boolean streaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
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
