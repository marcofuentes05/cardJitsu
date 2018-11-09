package Clases;
import java.util.ArrayList;
public class Deck {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasVisibles;
    public Deck (){
        this.cartas = new ArrayList<>();
        cartas.add(new Carta(5,"Amarillo","Agua"));
        cartas.add(new Carta(6,"Verde","Fuego"));
        cartas.add(new Carta(3,"Azul","Nieve"));
        cartas.add(new Carta(9,"Azul", "Fuego"));
        cartas.add(new Carta(7,"Rojo","Agua"));
        cartasVisibles=cartas;
        }
    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    public ArrayList<Carta> getCartasVisibles() {
        return cartasVisibles;
    }
    public void agregarCarta(Carta c){
        cartas.add(c);
    }
    public void usarCarta(Carta c){
        for (int i = 0; i <cartasVisibles.size();i++){
            if (cartasVisibles.get(i).getNumero()==(c.getNumero())){
                if (cartasVisibles.get(i).getColor().equals(c.getColor())){
                    if(cartasVisibles.get(i).getElemento().equals(c.getElemento())){
                        //Cuando se usa una carta, esta sale de las cartas visibles y otra la suplanta
                        cartasVisibles.remove(i);
                        int numAleatorio=(int)Math.floor(Math.random()*((-1)-(cartas.size()+1))+(cartas.size()));
                        cartasVisibles.add(cartas.get(numAleatorio));
                    }
                }
            }
        }
    }
    public void setCartasVisibles(ArrayList<Carta> cartasVisibles) {
        this.cartasVisibles = cartasVisibles;
    }
}