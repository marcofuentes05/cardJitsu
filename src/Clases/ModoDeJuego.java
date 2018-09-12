package Clases;
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
}