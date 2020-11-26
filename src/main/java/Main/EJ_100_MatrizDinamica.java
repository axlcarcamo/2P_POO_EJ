/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */

/*
Practica para el desarrollo de habilidadez con matrices (Bidimencionales).

 */
package Main;

/*
@author axelcarcamo
*/

import java.util.Scanner;

public class EJ_100_MatrizDinamica {
	public static void main(String[] args){ 
		
		Scanner tD=new Scanner(System.in);
		
		// Declaracion de variables segun el tipo de dato:
		String [][] nombres=new String[4][4];
		String [][] cion=new String[4][4];
		String [][] pp=new String[4][4];
		int [][] dd=new int[4][4];
		int [][] ddc=new int[4][4];
                
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
		
		System.out.println(" Bienvenido al sistema de pruebas para cambio de condicion ");
		System.out.println(" Ingrese el primer nombre: "); 
		nombres[0][0] = tD.nextLine();
		System.out.println(" Ingrese su direccion: ");
		cion[0][0] = tD.nextLine();
		System.out.println(" Ingrese el partido politico al cual perteneces: ");
		pp[0][0] = tD.nextLine();
		System.out.println(" Ingrese los primero digitos de su tarjeta de identidad : ");
		dd[0][0] = tD.nextInt();
		System.out.println(" Ingrese el resto de digitos de su tarjeta de identidad : ");
		ddc[0][0] = tD.nextInt();
		
		
		System.out.println("El registro relizado es para: " + nombres[0][0]);
		System.out.println(" Su direccion es: " + cion[0][0]);
		System.out.println(" Su numero de identidad es: 0" + dd[0][0] + ddc[0][0] + " Tegucigalpa");
		System.out.println(" Afiliacion politica es: " + pp[0][0]); 
			
		
	}
	
}
