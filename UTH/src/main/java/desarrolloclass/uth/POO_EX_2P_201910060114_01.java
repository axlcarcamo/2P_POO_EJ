/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Examen          : Segundo Parcial
Ejericio        : 01
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */
package desarrolloclass.uth;

/**
 * @author axelcarcamo
 */

import java.util.*;

public class POO_EX_2P_201910060114_01 {
    
    public static void main(String[] args) {
        
        
        // Declaracion de objeto.
        Scanner tD=new Scanner(System.in);
        
        
        // Declaracion de arreglo.
        String [] cadenaTXT = new String[10];
       
        
        
        int num=0;
        
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
                System.out.println(" Definicion");
                System.out.println(" Palindromo palíndromo, también llamado palíndromo, palíndroma o palindroma, es una palabra " );
                System.out.println(" frase que se lee igual en un sentido que en otro.");
                System.out.println(" ===========================================================================================");
		System.out.println(" ");
                System.out.println(" ===========================================================================================");
                
                // Ciclo para ingreso de palabras.
                for (int h=0; h<10; h++){
                System.out.println(" Por favor ingrese la palabra numero" + " " + h + ":");
                cadenaTXT[h] = tD.nextLine();
                cadenaTXT[h] = cadenaTXT[h].toLowerCase();
                if(cadenaTXT[h].charAt(h) != cadenaTXT[h].charAt(cadenaTXT[h].length() -h -1)){
                    System.out.println(" ===========================================================================================");
                    System.out.println("     POR FAVOR TOMAR EN CUENTA LA PALABRA QUE ESTA INTENTANDO INGRESAR NO ES PALINDROMA    ");
                    System.out.println("     POR RAZONES DE SEGURIDAD EL PROGRAMA NO LE PERMMITIRA EL INGRESO DE ESTA PALABRAS     ");
                    System.out.println(" ===========================================================================================");
                }else {
                    System.out.println(" ===========================================================================================");
                    System.out.println("  LA PALABRA SE ALMACENADO CORRECTAMENTE EN LA POSICION NUMERO: " + h + " DEL ARREGLO       ");
                    System.out.println(" ===========================================================================================");
                }
                
                }
                System.out.println("");
                System.out.println(" ===========================================================================================");
                System.out.println(" ===========================================================================================");
                System.out.println("El registro de palabras fue el siguiente: ");
                System.out.println("");
                System.out.println(" || " + cadenaTXT[0] + " ||");
                System.out.println(" || " + cadenaTXT[1] + " ||");
                System.out.println(" || " + cadenaTXT[2] + " ||");
                System.out.println(" || " + cadenaTXT[3] + " ||");
                System.out.println(" || " + cadenaTXT[4] + " ||");
                System.out.println(" || " + cadenaTXT[5] + " ||");
                System.out.println(" || " + cadenaTXT[6] + " ||");
                System.out.println(" || " + cadenaTXT[7] + " ||");
                System.out.println(" || " + cadenaTXT[8] + " ||");
                System.out.println(" || " + cadenaTXT[9] + " ||");
                System.out.println(" ===========================================================================================");
                System.out.println(" ===========================================================================================");
                
                System.out.println(" ");
                
                System.out.println(" ===========================================================================================");
                System.out.println("                LISTA DE PALABRAS SUGERIDAS SIENDO ESTAS PALINDROMAS                        ");
                System.out.println(" ===========================================================================================");
                System.out.println(" 01 OSO");
                System.out.println(" 02 ALA");
                System.out.println(" 03 NADAR ");
                System.out.println(" 04 RADAR ");
                System.out.println(" 05 AMO ");
                System.out.println(" 06 SATOR");
                System.out.println(" 07 AREPO");
                System.out.println(" 08 ROTAS");
                System.out.println(" 09 ROTAS");
                System.out.println(" 10 TENET");
                System.out.println(" ===========================================================================================");
                System.out.println("");
                
                
    }
    
   
   
 }
    



/*

Scanner tD=new Scanner(System.in);
String [][] detalles = new String [25][2];

System.out.println(" Por favor ingrese nombre completo (posicion 1): );
detalles[0][0] =tD.nextLine();


public static 



*/






















/*
#include <iostream>
#include <string>
using namespace std;
int main() {
    string texto;
    int aux = 0, igual = 0;
    
    cout << "Ingrese la oracion a evaluar: ";
    getline(cin >> ws, texto);
    
    for(int ind = texto.length() - 1; ind >= 0; ind--) {
        if(texto[ind] == texto[aux]) {
            igual++;
        }
        aux++;
    }
    
    if(texto.length() == igual) {
        cout << "La palabra ingresada es palindromo: " << endl;
    } else {
        cout << "La palabra ingresada no es palindromo: " << endl;
    }
    
    return 0;
}

*/
