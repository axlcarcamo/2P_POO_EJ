/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author axelcarcamo
 */
public class EJ_02_W {
	public static void main(String[] args) {

		Scanner tD = new Scanner(System.in);

		int ml = 0;
		int rl = 0;
		int acm = 1;

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
		System.out.println("                       Ejercicios de clase estructura repetitiva While                      ");
		System.out.println(" ===========================================================================================");
		System.out.println(" ===========================================================================================");
		System.out.println("     Bienvenido a continuancion se le brindaran unas instrucciones para llevar acabbo el    ");
		System.out.println("                                         Ejercicio                                          ");
		System.out.println(" ===========================================================================================");
		System.out.println(" ");
		System.out.println("    Ingrese un numero entero del cual usted desea obtener su tabla de multiplicacion         ");
		System.out.println("    Este siendo del 1 al 12: ");
		ml = tD.nextInt();
		while (acm > 0 && acm <= 12 && ml > 0 && ml <= 12) {
		rl = acm * ml;
		System.out.println(" ==================");
		System.out.println(" || " + ml + " X  " + acm + " = " + rl + " ||");
		acm++;

		}

	}

}
	

