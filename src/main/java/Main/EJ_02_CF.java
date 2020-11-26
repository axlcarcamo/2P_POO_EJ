/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**

@author axelcarcamo
 */

import java.util.Scanner ;
public class EJ_02_CF {
	public static void main(String[] args) {
		Scanner tD=new Scanner(System.in);
		
		int rL=0;
		int ent=0;
		
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
		System.out.println("                       Ejercicios de clase estructura repetitiva For                        ");
		System.out.println(" ===========================================================================================");
		System.out.println(" ===========================================================================================");
		System.out.println("     Bienvenido a continuancion se le brindaran unas instrucciones para llevar acabbo el    ");
		System.out.println("                                         Ejercicio                                          ");
		System.out.println(" ===========================================================================================");
		System.out.println("    Ingrese un numero entero del cual usted desea obtener su tabla de multiplicacion         ");
		System.out.println("    Este siendo del 1 al 12: "); ent = tD.nextInt();
		
			if (ent<=15) {
				for (int i = 1; i < 13; i++) {
				rL = i * ent;
				System.out.println(" | " + ent + " X " + i + " = " + rL + " |");	
				}
			}else{
				System.out.println(" El numero ingresado esta por sobre las tablas a poder admitir la para la ");
				System.out.println(" gestion del desarrollo ");
			}
		
		
	}
}

