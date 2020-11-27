/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author axelcarcamo
 */
import java.util.Scanner;

public class FN_ST {
	public static void main(String[] args) {
		
	 Scanner tD= new Scanner(System.in);
	 
	 String uno="";
	 String dos="";
	 int rst=0;
	 
	 System.out.println("Ingrese la primera cadena de texto: ");
	 uno = tD.nextLine();
	 System.out.println("Ingrese la segunda cadena de texto: ");
	 dos = tD.nextLine();
	 rst=recorrido(uno,dos);
	 System.out.println(" Segun el ingreso de texto este fue: " + rst);///SE PUDOOOOOOOO
	 
	}
}

public static int recorrido(String uno="", String dos=""){



	return uno + dos;
}

