/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */

import java.util.Scanner;

public class EJ_DSC {
	
	public static void main (String[] args){


	Scanner tD = new Scanner(System.in);
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
	
	System.out.println("Cuantos productos comprara?");
	int cantidadproducto = tD.nextInt();

	if (cantidadproducto < 5)
	{
	System.out.println("Tiene un 0% de descuento en su compra");
	}
	
	

	if ((cantidadproducto > 2) && (cantidadproducto < 5));
	{
	System.out.println("Tiene un 5% de descuento en su compra");
	}
	


	if (cantidadproducto > 5) 
	{
	System.out.println("¿Cual es el Subtotal de sus productos");
	int Subtotal = tD.nextInt();
	
		if ((Subtotal > 300) && (Subtotal < 1000)); {
		System.out.println("Tiene un 10% de descuento en su compra");
		}

		if (Subtotal > 1000){
		System.out.println("Tiene un 20% de descuento en su compra");
		}

	}

	
 }
}
