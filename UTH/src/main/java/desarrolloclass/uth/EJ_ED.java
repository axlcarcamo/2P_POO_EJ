
/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */
 import java.util.Scanner;

public class EJ_ED {
    public static void main(String[] args) {

        String[] arreglo = new String [];
        String[] arreglo2 = new String[5];

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

        System.out.println("Ingrese el nombre de la persona");
        arreglo [i] = tD.nextLine();
  

        System.out.println("Los nombres de mi arreglo son : " + arreglo[]);
        for (int i = 0; i<5; i++){
        System.out.println(arreglo [i]);
        }


        for (int i=0; i<5 ; i++)    static {

        System.out.println("Ingrese la edad de la persona");
        arreglo2 [i] = tD.next();
        }
    
    
        System.out.println("Las edades de mi arreglo son : " + arreglo2[]);
        for (int i = 0; i<5; i++){
        System.out.println(arreglo2 [i]);
        }
    
         System.out.println("La media de las edades es: ");
        for (int i = 0; i<5; i++){
        System.out.println((arreglo2 [i])/2);
        }
}

