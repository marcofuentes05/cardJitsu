package Clases;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;

public class Usuario {
    private String usuario;
    private String contrasena;
    private String correo;
    private Deck deck;
    private Perfil perfil;
    public ArrayList<Carta> cartasGanadasPartida;
    public int [][] matriz;

    //Constructor
    public Usuario(String user, String password, String correo){
        this.usuario= user;
        this.contrasena=password;
        this.correo=correo;
        this.deck = new Deck();
        this.cartasGanadasPartida = new ArrayList<>();
        this.matriz = new int [3][6];
    }

    //Este metodo obtiene la suma de todos los espacios de la matriz
    public int sumaFilas (){
        int suma = 0;
        for (int i = 0;i<3;i++){
            for (int j = 0;j<6;j++){
                suma = suma + matriz[i][j];
            }
        }
        return suma;
    }

    ///Este metodo imprime el estado del jugador en cuanto a cartas disponibles
    @Override
    public String toString(){
        String s="Estas son tus cartas: \n";
        for (int i = 0;i < deck.getCartasVisibles().size();i++){
            s = s + "Carta No. "+(i+1)+" Valor: "+deck.getCartasVisibles().get(i).getNumero()+", Color: "+deck.getCartasVisibles().get(i).getColor()+", Elemento: "+deck.getCartasVisibles().get(i).getElemento()+" \n";
        }
        return s;
    }

    //Este metodo agrega un espacio correspondiente a la matriz
    public void add (Carta c){
        cartasGanadasPartida.add(c);
        String color = c.getColor();
        String elemento = c.getElemento();
        int co;
        int el;
        if (color.equals("Rojo")){
            co = 0;
        }else if(color.equals("Amarillo")){
            co = 1;
        }else if(color.equals("Azul")){
            co = 2;
        }else if(color.equals("Naranja")){
            co= 3;
        }else if(color.equals("Verde")){
            co = 4;
        }else {
            co = 5;
        }
        if (elemento.equals("Fuego")){
            el = 0;
        }else if (elemento.equals("Agua")){
            el = 1;
        }else {
            el = 2;
        }

        if (matriz[el][co] == 0){
            matriz[el][co] = 1;
        }
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Deck getDeck() {
        return deck;
    }
    public void setDeck(Deck deck) {
        this.deck = deck;
    }
    public Perfil getPerfil() {
        return perfil;
    }
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
