package org.example.entities;

public class PartitaDiCalcio extends Evento{

    private String squadradicasa;
    private String squadraospite;
    private String squadravincente;
    private int golsquadradicasa;
    private int golsquadraospite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(int golsquadraospite, int golsquadradicasa, String squadravincente, String squadraospite, String squadradicasa) {
        this.golsquadraospite = golsquadraospite;
        this.golsquadradicasa = golsquadradicasa;
        this.squadravincente = squadravincente;
        this.squadraospite = squadraospite;
        this.squadradicasa = squadradicasa;
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
