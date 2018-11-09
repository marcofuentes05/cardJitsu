package Clases;

import java.util.ArrayList;

public class Usuario {
    private String usuario;
    private String contrasena;
    private String correo;
    private Deck deck;
    private Perfil perfil;
    public ArrayList<Carta> cartasGanadasPartida;
    public Usuario(String user, String password, String correo){
        this.usuario= user;
        this.contrasena=password;
        this.correo=correo;
        this.deck = new Deck();
        this.cartasGanadasPartida = new ArrayList<>();
    }
    @Override
    public String toString(){
        String s="Estas son tus cartas: \n";
        for (int i = 0;i < deck.getCartasVisibles().size();i++){
            s = s + "Carta No. "+(i+1)+" Valor: "+deck.getCartasVisibles().get(i).getNumero()+", Color: "+deck.getCartasVisibles().get(i).getColor()+", Elemento: "+deck.getCartasVisibles().get(i).getElemento()+" \n";
        }
        return s;
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
