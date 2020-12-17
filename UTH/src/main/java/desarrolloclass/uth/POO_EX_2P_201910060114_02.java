/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Examen          : Segundo Parcial
Ejericio        : 02
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

NOTA: 

 */

package desarrolloclass.uth;

/**
 *
 * @author axelcarcamo
 */
import java.util.*;



public class POO_EX_2P_201910060114_02 {
    public static void main(String[] args) {
       
 
        Scanner tD=new Scanner(System.in);
        
        
        // Declaracion de arreglo;
        String [] det =new String[25]; 
        String [] det1 = new String[25];
        
       
        
        
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
        System.out.println(" ===========================================================================================");
        System.out.println("                          REGISTRO DE PARTICIPACION EN CONFERENCIA                          ");
        System.out.println(" ===========================================================================================");
        System.out.println(" ");
        
        
        for (int i=0; i<det.length; i++){
            tD.nextLine();
            for ( int j=0; j<det1.length;j++){
            System.out.println(" Por favor ingrese el nombre de la conferencia a la cual asistira:  ");
            det[i]=tD.nextLine();
            System.out.println(" Estimado alumno por favor ingrese su numero de cuenta:  ");
            det1[j]=tD.nextLine();
            }
        }
        
        for (int x=0; x<det.length; x++){
            for (int y=0; y<det1.length; y++){
                System.out.println("El registro llevado acabo por su person fue conferencia : " + det[x] + " numero de cuenta " + det1[y]);
             }
        }
        
       
               
    }
    

     
                    
                    
            
        
            
        
    
}
    
   

