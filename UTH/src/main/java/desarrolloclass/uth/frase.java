package com.company;
import java.util.Scanner;
public class frase {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            String cadena = "";
            char[] Arraycadena;
            char caracter;
            int contador = 0;
            System.out.println("Escribe una frase");
            cadena = lector.nextLine();
            Arraycadena = cadena.toCharArray();
            for (int i = 0; i < Arraycadena.length; i++) {
                caracter = Arraycadena[i];
                for (int j = 0; j < Arraycadena.length; j++) {
                    if (Arraycadena[j] == caracter) {
                        contador++;
                    }
                }
                System.out.println(Arraycadena[i] + " " + contador);
                contador = 0;
            }
        }

    }
