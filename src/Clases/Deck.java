package Clases;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasVisibles;

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartasVisibles() {
        return cartasVisibles;
    }

    public void setCartasVisibles(ArrayList<Carta> cartasVisibles) {
        this.cartasVisibles = cartasVisibles;
    }
}
