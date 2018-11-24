package Clases;

import java.util.ArrayList;

public class Perfil {
    private int victorias;
    private int derrotas;
    private int xp;
    private ArrayList<Cinturon> cinturones;


    public int getVictorias() {
        return victorias;
    }
    public void partidaGanada(){
        victorias = victorias + 1;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void partidaPerdida(){
        derrotas = derrotas + 1;
    }

    public int getXp() {
        return xp;
    }
    public void sumarXp(int a){
        xp = xp + a;
    }

    public Cinturon getCinturon() {
        return cinturones.get(cinturones.size()-1);
    }
    public void agregarCinturon(Cinturon c){
        cinturones.add(c);
    }

}
