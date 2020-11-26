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


import java.util.Scanner;
public class EJ_02_DW {
	public static void main(String[] args) {
		Scanner tD= new Scanner(System.in);
		
		int v1=0;
		int rLL=0;
		
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
		System.out.println("                       Ejercicios de clase estructura repetitiva Do While                   ");
		System.out.println(" ===========================================================================================");
		System.out.println(" ===========================================================================================");
		System.out.println("     Bienvenido a continuancion se le brindaran unas instrucciones para llevar acabbo el    ");
		System.out.println("                                         Ejercicio                                          ");
		do {
		System.out.println(" ===========================================================================================");
		System.out.println("    Ingrese un numero entero del cual usted desea obtener su tabla de multiplicacion         ");
		System.out.println("    Este siendo del 1 al 12: "); rLL = tD.nextInt();	
		}
		while (rLL>12 || rLL<0);
		
		for (int i = 1; i < 13; i++) {
		v1 = i * rLL;
		System.out.println(" | " + rLL + " X " + i + " = " + v1 + " |");	
		}
		
	}
}
