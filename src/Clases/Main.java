package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        //Se define una lista que contiene todos los jugadores de la base de datos
        //Y otra que unicamente contiene los jugadres que jugaran esta partida
        ArrayList<Usuario> usuarios = new ArrayList();
        ArrayList<Usuario> jugadores = new ArrayList();

        //Estos usuarios sirven de prueba.
        usuarios.add(new Usuario("Marco","Cinco","hola@gmail.com"));
        usuarios.add(new Usuario("Chus","Seis","adios@gmail.com"));

        Scanner input = new Scanner(System.in);
        Scanner input1= new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);



        for (int a = 0;a <usuarios.size();a++){
            //Se hace el inicio de sesion para ambos usuarios, verificando usuarios y contraseñas
            Boolean datos = false;
            while (datos==false){
                System.out.println("Ingrese su usuario "+(a+1)+":");
                String usuario = input.nextLine().toString();
                System.out.println("Intrese su contraseña "+(a+1)+"");
                String contrasena = input1.nextLine().toString();

                for (int i = 0; i<usuarios.size();i++){
                    if (usuarios.get(i).getUsuario().equals(usuario)){
                        if (usuarios.get(i).getContrasena().equals(contrasena)){
                            datos = true;
                            jugadores.add(usuarios.get(i));
                        }else{
                            System.out.println("Hay datos incorrectos");
                        }
                    }
                }
            }
        }

        if (jugadores.size()!=2){
            System.out.println("Hay datos incorrectos!");
        }else{
            System.out.println("Bienvenidos ambos");
            int turno = 1;
            Boolean sigue = true;
            while (sigue){
                ArrayList<Carta> cartasEnJuego = new ArrayList<>();
                for (int a  = 0; a<2;a++){
                    System.out.println("Jugaddor "+(a));
                    System.out.println(jugadores.get(a).toString());
                    System.out.print("Ingrese el numero de su elección de carta: ");
                    try{
                        int respuesta = input2.nextInt();
                        cartasEnJuego.add(jugadores.get(turno%2).getDeck().getCartasVisibles().get(respuesta));
                    }catch(Exception e){}
                }
            }
        }








    }
}