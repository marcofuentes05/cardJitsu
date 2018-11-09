package Clases;

import java.util.ArrayList;

public class ModoDeJuego {
    private String nombre;
    public ModoDeJuego(String m){
        this.nombre = m;
    }
    public String getNombre() {
        return nombre;
    }
    //El metodo juez determinará el ganador. Si retorna TRUE, gana el jugador 1, de lo contrario, gana jugador 2. Retorna null si es empate
    public Boolean juez(Carta j1, Carta j2){
        Boolean resultado=null;
        if (nombre.equals("modo1")){
            if (j1.getNumero()> j2.getNumero()){
                resultado = true;
            }else if (j1.getNumero()< j2.getNumero()){
                resultado = false;
            }else{
                if (j1.getElemento().equals(j2.getElemento())){
                    resultado = null;
                }else if(j1.getElemento().equals("Agua")){
                    if (j2.getElemento().equals("Hielo")){
                        resultado = false;
                    }else if(j2.getElemento().equals("Fuego")){
                        resultado = true;
                    }
                }else if(j1.getElemento().equals("Hielo")){
                    if (j2.getElemento().equals("Fuego")){
                        resultado = false;
                    }else if (j2.getElemento().equals("Agua")){
                        resultado = true;
                    }
                }else if(j1.getElemento().equals("Fuego")){
                    if (j2.getElemento().equals("Agua")){
                        resultado = false;
                    }else if (j2.getElemento().equals("Hielo")){
                        resultado = true;
                    }
                }
            }
        }else{
            //TODO definir reglas para el segundo modo de juego
        }

        return resultado;
    }
    public boolean sigue (ArrayList<Carta> lista){
        Boolean seguir = true;
        if (lista.size()>=3){
            int rojo = 0;
            int azul = 0;
            int amarillo = 0;
            int morado = 0;
            int naranja = 0;
            int verde = 0;
            int agua = 0;
            int fuego = 0;
            int nieve = 0;
            for (int i = 0;i < lista.size();i++){

                switch (lista.get(i).getElemento()){
                    case "Agua":
                        agua = agua + 1;
                        break;
                    case "Fuego":
                        fuego = fuego + 1;
                        break;
                    case "Nieve":
                        nieve = nieve + 1;
                }
                switch(lista.get(i).getColor()){
                    case "Amarillo":
                        amarillo = amarillo + 1;
                        break;
                    case "Rojo":
                        rojo = rojo + 1;
                        break;
                    case "Azul":
                        azul = azul + 1;
                        break;
                    case "Morado":
                        morado = morado + 1;
                        break;
                    case "Naranja":
                        naranja = naranja + 1;
                        break;
                    case "Verde":
                        verde = verde + 1;
                        break;
                }
            }
        }else{
            seguir = true;
        }
        return seguir;
    }
    public String toString(Boolean a){
        String resultado = "";
        if (a == true){
            resultado = "Jugador 1";
        }else{
            resultado = "Jugador 2";
        }
        return resultado;
    }
}