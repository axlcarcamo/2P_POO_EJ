/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */

package Main;

/*
@author axelcarcamo
*/

// Arreglo de tamaño 50 con números aleatorios en el mismo rango, luego mostrar el mayor numero de todos*/


package com.company;
/*import java.util.Scanner;*/
public class EJ_N_Aleatorios {

    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);*/
        
        /* Banner correspondiente a la univerisidad */
        System.out.println(" ===========================================================================================");
	System.out.println(" ||                                                                                       ||");
	System.out.println(" ||                                                                                       ||");
	System.out.println(" ||                                                                                       ||");
	System.out.println(" ||                            7MMF     7MF MMPMMMMMMYMM  7MMF    7MMF                    ||");
	System.out.println(" ||                             MM       M  P    MM    7   MM      MM                     ||");
	System.out.println(" ||                             MM       M       MM        MM      MM                     ||");
	System.out.println(" ||                             MM       M       MM        MMmmmmmmMM                     ||");
	System.out.println(" ||                             MM       M       MM        MM      MM                     ||");
	System.out.println(" ||                             YM       M       MM        MM      MM                     ||");
	System.out.println(" ||                              bbmmmmdd       JMML      JMML    JMML                    ||");
	System.out.println(" ||                                                                                       ||");
	System.out.println(" ||                                                                                       ||");
	System.out.println(" ||                            Universidad Tecnologica de Honduras                        ||");
	System.out.println(" ||                              Programacion Orientada a Objetos                         ||");
	System.out.println(" ===========================================================================================");
	System.out.println(" ===========================================================================================");
	System.out.println(" ");
	System.out.println("                                  Ejercicios de clase                                       ");
	System.out.println(" ===========================================================================================");

        int[]arreglo = new int[50];
        int num = 0;
        System.out.println("Los numeros aleatorios son:");
        for(int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*50+1);
            System.out.print(arreglo[i] + ",");
        }
        int mayor = 0;
        for(int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        System.out.println();
        System.out.println("El numero mayor del arreglo es: " + mayor);



    }
}
