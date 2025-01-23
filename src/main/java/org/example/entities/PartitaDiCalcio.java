package org.example.entities;

import org.example.enumeration.TipoEvento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "partite_di_calcio")

public class PartitaDiCalcio extends Evento{

    @Column(nullable = false)
    private String squadradicasa;
    @Column(nullable = false)
    private String squadraospite;
    private String squadravincente;
    private int golsquadradicasa;
    private int golsquadraospite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, String squadradicasa, String squadraospite, String squadravincente, int golsquadradicasa, int golsquadraospite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.squadradicasa = squadradicasa;
        this.squadraospite = squadraospite;
        this.squadravincente = squadravincente;
        this.golsquadradicasa = golsquadradicasa;
        this.golsquadraospite = golsquadraospite;
    }

    public String getSquadradicasa() {
        return squadradicasa;
    }

    public void setSquadradicasa(String squadradicasa) {
        this.squadradicasa = squadradicasa;
    }

    public String getSquadraospite() {
        return squadraospite;
    }

    public void setSquadraospite(String squadraospite) {
        this.squadraospite = squadraospite;
    }

    public String getSquadravincente() {
        return squadravincente;
    }

    public void setSquadravincente(String squadravincente) {
        this.squadravincente = squadravincente;
    }

    public int getGolsquadradicasa() {
        return golsquadradicasa;
    }

    public void setGolsquadradicasa(int golsquadradicasa) {
        this.golsquadradicasa = golsquadradicasa;
    }

    public int getGolsquadraospite() {
        return golsquadraospite;
    }

    public void setGolsquadraospite(int golsquadraospite) {
        this.golsquadraospite = golsquadraospite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadradicasa='" + squadradicasa + '\'' +
                ", squadraospite='" + squadraospite + '\'' +
                ", squadravincente='" + squadravincente + '\'' +
                ", golsquadradicasa=" + golsquadradicasa +
                ", golsquadraospite=" + golsquadraospite +
                '}';
    }
}
