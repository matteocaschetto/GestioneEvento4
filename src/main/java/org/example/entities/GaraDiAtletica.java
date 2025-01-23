package org.example.entities;

public class GaraDiAtletica extends Evento{

    private Persona atleti;
    private Persona vincitore;

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(Persona atleti, Persona vincitore) {
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public Persona getAtleti() {
        return atleti;
    }

    public void setAtleti(Persona atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
