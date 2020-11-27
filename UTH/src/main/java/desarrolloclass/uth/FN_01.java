/*
Univerisidad Tecnologica de Honduras
Catedratico : Ing. Walter Suazo.
Tema        : Funciones
Clase       : Progframacion Orientada a Objetos.
Fecha       : 20201124
 */
package Main;

/*
NOTA: Funciones son porciones de codigo 

el vinculo referido es para obtener detalles de las distintas unidades de medida
Referencias para unidades de medida: https://agunsa.com/informacion-de-interes/tablas-de-conversion/ 

*/

import java.util.Scanner;




public class FN_01 {
	
	
	
	public static void main(String[] args) {
		
		Scanner tD=new Scanner(System.in);
		
			
		
	// Declaracion de variables.
	
	// Datos primitivos enteros.
	// Opciones de los menus en el desarrollo
	int op1 =0; // Menu de opciones 1
	int op2 =0; // Sub menu para unidades de Longitud
	int op3 =0; // Sub menu para unidades de peso
	int op4 =0; // Sub menu para unidades de volumen
	int op5 =0; // Sub menu para unidades de Temperatura
	
	int mil=1000;
	int cien=100;
	
	// Almacenamiento de datos de operaciones mediante funciones para impresion de pantallas.
	int lgo1=0;
	int lgo2=0;
	int lgo3=0;
	int lgo4=0;
	int lgo5=0;
	int lgo6=0;
	int lgo7=0;
	int lgo8=0;
	int lgo9=0;
	
	
	int prs1=0;
	
	
	
	
	// Resultado de operacion de unidades de longitud
	double opl1=0; // Opcion 1 del menu de longitud
	double opl2=0; // Opcion 2 del menu de longitud
	int opl3=0; // Opcion 3 del menu de longitud
	int opl4=0; // Opcion 4 del menu de longitud
	int opl5=0; // Opcion 5 del menu de longitud
	int opl6=0; // Opcion 6 del menu de longitud
	int opl7=0; // Opcion 7 del menu de longitud
	int opl8=0; // Opcion 8 del menu de longitud
	int opl9=0; // Opcion 9 del menu de longitud
	
	
	// Resultado de operacion de unidades de masa | peso
	int opm1=0; // Opcion 1 del menu de masa
	int opm2=0; // Opcion 2 del menu de masa
	int opk3=0; // Opcion 3 del menu de masa
	int opm4=0; // Opcion 4 del menu de masa
	int opm5=0; // Opcion 5 del menu de masa
	int opm6=0; // Opcion 6 del menu de masa
	int opm7=0; // Opcion 7 del menu de masa
	int opm8=0; // Opcion 8 del menu de masa
	int opm9=0; // Opcion 9 del menu de masa
	
	// Resultado de operacion de unidades de temperatura
	int opt1=0; // Opcion 1 del menu de masa
	int opt2=0; // Opcion 2 del menu de masa
	int opt3=0; // Opcion 3 del menu de masa
	int opt4=0; // Opcion 4 del menu de masa
	int opt5=0; // Opcion 5 del menu de masa
	int opt6=0; // Opcion 6 del menu de masa

	
	// Datos primitivos unidades de longitud
	
	double dmamm=0; // Almacen de datos de metro a milimetros.
	double dmmam=0; // Almacen de datos de milimetros a metros.
	
	float dmacm=0; // Almacen de datos de metro a centimentros.
	float dcmam=0; // Almacen de datos de centimetros a metros.
	
	int dmakm=0; // Almacen de datos de metros a kilometros.
	int dkmam=0; // Almacen de datos de kilometros a metros
	
	int dmami=0; // Almacen de datos de metros a millas.
	int dmiam=0; // Almacen de datos de millas a metros.
	
	
	
	// Datos primitivos unidades de PESO o MASA
	int dgal=0; // Almacen de datos gramos a libras
	int dlag=0; // Almacen de datos libras a gramos
	
	int dlakg=0; // Almacen de datos libras a kilogramos
	int dkgal=0; // Almacen de datos kilogramos a libras
	
	int dlamg=0; // Almacen de datos libras a miligramos
	int dmgal=0; // Almacen de datos miliggramis a libras
	
	int dtakg=0; // Almacen de datos toneladas a kilogramos
	int dkgat=0; // // Almacen de datos kilogramos a toneladas
	
	
	// Datos primitivos unidades Temperatura
	
	int dgcaf=0; // Almacen de datos de grados celsius a farenheit 
	int dgfac=0; // Almacen de datos de grados farenheit a celsius
	
	int dgfak=0; // Almacen de datos de grados farenheit a kelvin
	int dgkaf=0: // Almacen de datos de grados kelvin a farenheit
	
	int dgcak=0; // Almacen de datos de grados celsius a kelvin
	int dgkac=0; // Almacen de datos de grados kelvin a celsius
	
		do {
		System.out.println("===============================================================================================");
		System.out.println("=============================== MENU PRINCIPAL ================================================");
		System.out.println("===============================================================================================");
		System.out.println("             Bienvenido al gestor para conversion de LONGITUD | PESO | VOLUMEN                 ");
		System.out.println("===============================================================================================");
		System.out.println("||  01 Conversion unidades de LONGITUD                                                       ||");
		System.out.println("||  02 Conversion unidades de MASA                                                           ||");
		System.out.println("||  03 Conversion unidades de VOLUMEN                                                        ||");
		System.out.println("||  04 Conversion unidades de TEMPERATURA                                                    ||");
		System.out.println("||  05 Salir                                                                                 ||");
		System.out.println("===============================================================================================");
		System.out.println("    Su opcion es: "); op1 = tD.nextInt();
		}while(op1>6 || op1<1);
		
		switch(op1){
			case 1:
				do {
				System.out.println("");
				System.out.println("===============================================================================================");
				System.out.println("========================== CONVERSION UNIDADES DE LONGITUD  ===================================");
				System.out.println("===============================================================================================");
				System.out.println("||  01 Desea convertir de metros(m) a milimetros(mm)                                         ||");
				System.out.println("||  02 Desea convertit de milimetros(mm) a metros(m)                                         ||");
				System.out.println("||  03 Desea convertir de metros(m) a centimetros (cm)                                       ||");
				System.out.println("||  04 Desea convertir de centimetros(cm) a metros (m)                                       ||");
				System.out.println("||  05 Desea convertir de metros(m) a Kilometros(km)                                         ||");
				System.out.println("||  06 Desea convertir de kilometros(km) a metros(m)                                         ||");
				System.out.println("||  08 Desea convertir de netros(m) a millas(Mi)                                             ||");
				System.out.println("||  09 Desea convertir de millas(Mi) a metros(m)                                             ||");
			        System.out.println("||  10 Salir                                                                                 ||");
				System.out.println("===============================================================================================");
				System.out.println("      Su opcion es: "); op2 =tD.nextInt();
				}while (op2>10 || op2<1);
				
				// Switch para operaciones para unidades de conversion de longitud
				switch (op2){
					case 1:
						System.out.println("");
						System.out.println("===============================================================================================");
						System.out.println("");
						System.out.println(" Por favor ingrese el valor en metros: ");
						dmamm =tD.nextFloat();
						opl1 =ml(dmamm, mil);
						System.out.println("El resultado de la operacion es igual a:  " + opl1 + " milimetros(mm)");
						System.out.println("El valor ingresado es fue de: " + dmamm + " metros(m)");
						System.out.println("===============================================================================================");
						break;
					case 2:
						System.out.println("");
						System.out.println("===============================================================================================");
						System.out.println("");
						System.out.println(" Por favor ingrese el valor en milimetros: ");
						dmmam =tD.nextDouble();
						opl2 = dvs(dmmam, mil);
						System.out.println("El resultado de la operacion es igual a:  " + opl2 + " metros(m)");
						System.out.println("El valor ingresado es fue de: " + dmmam + " milimetros(mm)");
						System.out.println("===============================================================================================");
						break;
					case 3: 
						break;
					case 4: 
						break;
					case 5: 
						break;
					case 6: 
						break;
					case 7:
						break;
					case 8:
						break;
					case 9:
						break;
					case 10: 
						break;	
					default: 
						break;
					
				 
				}
				
				
				
				System.out.println("===============================================================================================");
				System.out.println("");
				break;
			case 2:
				do {
				System.out.println("");
				System.out.println("===============================================================================================");
				System.out.println("=============================  CONVERSION UNIDADES DE MASA  ===================================");
				System.out.println("===============================================================================================");
				System.out.println("||  01 Desea convertir de libras(l) a gramos(g)                                              ||");
				System.out.println("||  02 Desea convertit de gramos(g) a libras(l)                                              ||");
				System.out.println("||  03 Desea convertir de libras(l) a kilogramos(kg)                                         ||");
				System.out.println("||  04 Desea convertir de kilogramos(kg) a libras(l))                                        ||");
				System.out.println("||  05 Desea convertir de libras(l) a miligramos(mg)                                         ||");
				System.out.println("||  06 Desea convertir de miligramos(mg)) a libras(l)                                        ||");
				System.out.println("||  08 Desea convertir de Toneladas(Tn) a libras(l)                                          ||");
				System.out.println("||  09 Desea convertir de libras(l) a Toneladas(Tn)                                          ||");
			        System.out.println("||  10 Salir                                                                                 ||");
				System.out.println("===============================================================================================");
				op2 =tD.nextInt();
				}while (op3>10 || op3<1);
				switch (op3){
					case 1:
						System.out.println("");
						System.out.println("===============================================================================================");
						System.out.println("");
						
						break;
					case 2:
						break;
					case 3: 
						break;
					case 4: 
						break;
					case 5: 
						break;
					case 6: 
						break;
					case 7:
						break;
					case 8:
						break;
					case 9:
						break;
					case 10: 
						break;	
					default: 
						break;	
				}
				
				System.out.println("===============================================================================================");
				System.out.println("");
				break;
			case 3: 
				System.out.println("");
				System.out.println("=============================  CONVERSION UNIDADES DE VOLUMEN =================================");
				
				System.out.println("===============================================================================================");
				break;
			case 4: 
				do {
				System.out.println("");
				System.out.println("===============================================================================================");
				System.out.println("=========================== CONVERSION DE UNIDADES DE TEMPERATURA =============================");
				System.out.println("===============================================================================================");
				System.out.println("||  01 Desea convertir de grados celsius(C) a faranheit(F)                                   ||");
				System.out.println("||  02 Desea convertit de grados faranheit(F) a celsius(C)                                   ||");
				System.out.println("||  03 Desea convertir de grados faranheit(F) a Kelvin(K)                                    ||");
				System.out.println("||  04 Desea convertir de grados Kelvin(K)  a faranheit(F)                                   ||");
				System.out.println("||  05 Desea convertir de grados celsius(C) a Kelvin(K)                                      ||");
				System.out.println("||  06 Desea convertir de grados Kelvin(K)  a celsius(C)                                     ||");
			        System.out.println("||  07 Salir                                                                                 ||");
				System.out.println("===============================================================================================");
				op2 =tD.nextInt();
				}while (op4>10 || op4<1);
				
				switch (op4){
					case 1:
						System.out.println("");
						System.out.println("===============================================================================================");
						System.out.println("");
						
						break;
					case 2:
						break;
					case 3: 
						break;
					case 4: 
						break;
					case 5: 
						break;
					case 6: 
						break;
					case 7:
						break;
					default:
						break;
				}
			

		
		}
	}
	
	
	
	public static double ml(double x, double y){
		
	 return x*y;
	}
	
	public static double dvs(double x, double y){
		
	 return x/y;
	}
	
	
	
	
}

