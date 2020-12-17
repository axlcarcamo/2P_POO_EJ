
package desarrolloclass.uth;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author axelcarcamo
 */
public class POO_2P_AlgoritmoSample {
        public static void main(String[] args) {
        
        Scanner tD=new Scanner(System.in);
        
        int [] Arre ={7,4,9,10,5,6,1,2,3,8};
        
            System.out.println("Se realizo un llenado de espacios de manera autonoma representado de la siguiente manera");
            System.out.println("7,4,9,10,5,6,1,2,3");
            System.out.println("Posicion 1: " + Arre[0]);
            System.out.println("Posicion 1: " + Arre[1]);
            System.out.println("Posicion 1: " + Arre[2]);
            System.out.println("Posicion 1: " + Arre[3]);
            System.out.println("Posicion 1: " + Arre[4]);
            System.out.println("Posicion 1: " + Arre[5]);
            System.out.println("Posicion 1: " + Arre[6]);
            System.out.println("Posicion 1: " + Arre[7]);
            System.out.println("Posicion 1: " + Arre[8]);
            System.out.println("Posicion 1: " + Arre[9]);
            Arrays.sort(Arre);
            for(int h: Arre){
                System.out.println(h + " , ");
            }
                
    }
    
}

