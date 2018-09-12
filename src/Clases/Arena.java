package Clases;

import java.util.ArrayList;

public class Arena {
    private ArrayList<Usuario> usuarios;
    private ModoDeJuego modoDeJuego;

    public Arena (ArrayList <Usuario> jugadores, ModoDeJuego m){
        this.usuarios = jugadores;
        this.modoDeJuego = m;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ModoDeJuego getModoDeJuego() {
        return modoDeJuego;
    }

    public void setModoDeJuego(ModoDeJuego modoDeJuego) {
        this.modoDeJuego = modoDeJuego;
    }
}
