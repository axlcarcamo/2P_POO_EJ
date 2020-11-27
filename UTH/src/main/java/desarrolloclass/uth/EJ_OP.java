/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */

public class EJ_OP{
    
    
public static void main (String[] args){
    
    double n1=120.4, n2=300.8, suma, resta, multiplicacion, division;
    
        
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
       
        suma=n1+n2;
        resta=n1-n2;
	multiplicacion=n1*n2;
	division=n1/n2;
	System.out.print("La suma de: ");
	System.out.println(n1 + " + " + n2 + " = " + suma);

	System.out.print("La resta de: ");
	System.out.println(n1 + " - " + n2 + " = " + resta);

	System.out.print("La multiplicacion de: ");
	System.out.println(n1 + " * " + n2 + " = " + multiplicacion);

	System.out.print("La division de: ");
	System.out.println(n1 + " / " + n2 + " = " + division);
    }
}