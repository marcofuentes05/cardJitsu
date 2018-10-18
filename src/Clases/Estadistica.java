package Clases;

public class Estadistica {
    private int victorias;
    private int derrotas;
    private double xp;

    public int getVictorias() {
        return victorias;
    }

    public void sumarVictoria() {
        this.victorias = victorias+1;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void sumarDerrota() {
        this.derrotas = derrotas+1;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
}
