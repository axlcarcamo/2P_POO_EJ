/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Carrera         : Ing. Computacion.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */
package universidadtecnologicahonduras.desarrollotareas;

/**
 * @author axelcarcamo
 */
import java.util.*;

public class EJ_Recursividad {
    public static void main(String[] args) {
        
        // Declaracion del objeto scanner.
        Scanner tD = new Scanner(System.in);
        
        // declaracion de variables
        int n1, n2=0;
        

        System.out.println("Introduzca el primer numero: ");                                                          
        n1 = tD.nextInt();
        System.out.println("Introduzca segundo numero: ");
        n2 = tD.nextInt();
        System.out.println("suma: " + suma(n1, n2));                                                              

    }
    
    public static int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma(a, b - 1);
        }
    }
}
        
