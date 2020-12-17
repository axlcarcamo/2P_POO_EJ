/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Tarea           : 2Parcial Implementación de Algoritmo
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */
package desarrolloclass.uth;

/**
 * @author axelcarcamo
 */

import java.util.*;

public class POO_2P_T_Algoritmo {
    public static void main(String[] args) {
        
        Scanner tD=new Scanner(System.in);
        
        int [] numero =new int[9];
        
        
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
                System.out.println("  A continuacion se le solicitara el ingreso de de algunos valores para llenar los espacios");
                System.out.println("  del arreglo y con ello validar si el algoritmo funciona los ingresos son 6               ");
                System.out.println("  y con ello poder crear el arreglo recuerde que son numero en un intervalo de 1 - 10      ");
                System.out.println(" ===========================================================================================");
                do {
                System.out.println(" Ingrese el valor 1: ");
                numero[0] =tD.nextInt();
                } while (numero[0]>10);
                System.out.println(" ===========================================================================================");
                
                do {
                System.out.println(" Ingrese el valor 2: ");
                numero[1] =tD.nextInt();
                } while (numero[1]>10);
                System.out.println(" ===========================================================================================");
                
                do {
                System.out.println(" Ingrese el valor 3: ");
                numero[2] =tD.nextInt();
                } while (numero[2]>10);
                System.out.println(" ===========================================================================================");
                
                do {
                System.out.println(" Ingrese el valor 4: ");
                numero[3] =tD.nextInt();
                } while (numero[3]>10);
                System.out.println(" ===========================================================================================");
                
                do {
                System.out.println(" Ingrese el valor 5: ");
                numero[4] =tD.nextInt();
                } while (numero[4]>10);
                System.out.println(" ===========================================================================================");
                
                do {
                System.out.println(" Ingrese el valor 6: ");
                numero[5] =tD.nextInt();
                } while (numero[5]>10);
                System.out.println(" ===========================================================================================");
                

                
                System.out.println(" Segun el ingreso de datos su arreglo queda del siguiente modo: ");
                System.out.println(" Posicion 1: " + numero[0]);
                System.out.println(" Posicion 2: " + numero[1]);
                System.out.println(" Posicion 3: " + numero[2]);
                System.out.println(" Posicion 4: " + numero[3]);
                System.out.println(" Posicion 5: " + numero[4]);
                System.out.println(" Posicion 6: " + numero[5]);
                System.out.println(" ===========================================================================================");
                System.out.println(" NOTA: el arreglo hasta este momento no a efectuado la organizacion                         ");
                System.out.println(" ===========================================================================================");
                
                System.out.println("Inicio del proceso de organizacion");
                Arrays.sort(numero);
                System.out.println(" ===========================================================================================");
                for (int i: numero){
                    System.out.println(i + " , ");
                 }
                System.out.println(" ===========================================================================================");
  
    }
    
}
