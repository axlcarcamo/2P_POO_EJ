/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */

import java.util.Scanner;

public class EJ_TND {
	public static void main (String[] args)
	{
		Scanner tD = new Scanner (System.in);
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
		
        System.out.println("Cuantos productos va llevar?");
        int prod = tD.nextInt();

			
        if(prod < 0){
        System.out.println("Error, no puede ingresar una cantidad de productos negativa");
	}
	else{
            if(prod >= 5){
            System.out.println("Felicidades, tiene un 15% de descuento :)");
            }
            else{
                System.out.println("No tiene descuento :(");
                }

            }

	}
}
