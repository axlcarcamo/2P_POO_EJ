/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */

import java.util.Scanner;

public class EJ_Palabras{

 public static void main(String[] args){
     
 Scanner tD=new Scanner(System.in);
            char a,e,i,o,u;
            
            
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
		
            System.out.println("El Programa le mostrara tres palabras que inicien con la vocal que usted ingrese");
            System.out.println("Ingrese una vocal (a, e, i, o, u)");
            char vocal = tD.nextLine().charAt(0);
	
                if(vocal == 'a') {
                System.out.println("Aire, Aguacate, Avion");
                }
	
                if(vocal == 'e') {
                System.out.println("Elefante, Espejo, Escalera");
                }

                if(vocal == 'i') {
                System.out.println("Idioma, Idea, Impresora");
                }

                if(vocal == 'o') {
                System.out.println("Oso, Oreja, ocho");
                }

                if(vocal == 'u'	) {
                System.out.println("Unicornio, Uniforme, Unidad");
                }

    }

}