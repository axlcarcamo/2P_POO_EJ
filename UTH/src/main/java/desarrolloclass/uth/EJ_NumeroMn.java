/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */

import java.util.Scanner;

public class EJ_NumeroMn{

public static void main (String args[]){

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

        System.out.println("El programa le dira cual es el numero mas pequeño");
        System.out.println("Ingrese el primer numero");
        int num1 = tD.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = tD.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = tD.nextInt();



	if ((num1<num2) && (num1<num3)){
	System.out.println("El numero menor es " +num1);
	}
		

	else if ((num2<num1 && num2<num3)){
	System.out.println("El numero menor es " +num2);
	}


	else if ((num3<num1) && (num3<num2)){
	System.out.println("El numero menor es " +num3);
	}
	
	
		
    }


}