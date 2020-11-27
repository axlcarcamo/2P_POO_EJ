/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */

import java.util.Scanner;



public class EJ_Notas
{

	public static void main (String[] args);{
	
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

	System.out.println("Promedio de nota de un alumno ");
	
	int n1= 0, n2 = 0, total = 0;


	System.out.println("Ingrese nota acumulativa : ");
	int n1 = tD.nextInt();



	if (n1>=71)

	{
	texto = r.nextLine();
	}	
		else
		{
		System.out.println("Ingrese un valor menor de 70");
		}


	System.out.println("Ingrese nota de examen : ");
	int n2 = leer.nextInt();


	if (n2>=31)
	{
	texto = r.nextLine();
	}	
		else
		{
		System.out.println("Ingrese un valor menor de 30");
		}


	System.out.println("Su nota final es: " + n1 + "+" + n2 + "=" +total);


	if (n1+n2>=70)
{
	System.out.println("Felicidades, aprobo su clase");
}
	else
	{
	System.out.println("lo siento, reprobo su clase");
	}
	


	}
}
	

