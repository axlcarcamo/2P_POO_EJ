package com.company;
import java.util.Scanner;

public class ciclos {
        public static void main(String[] args) {
            int s = 1;
            while (s != 2) {
                System.out.println("Tabla de multiplicar del 1 al 12");
                Scanner entrada = new Scanner(System.in);
                int n;
                System.out.println("Introduce un número entero: ");
                n = entrada.nextInt();
                if (n > 0 || n <= 12) {
                    System.out.println("Tabla del " + n);
                    for (int i = 1; i <= 12; i++) {
                        System.out.println(n + " * " + i + " = " + n * i);
                    }
                    System.out.println("Desea visualizar otra tabla? ");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    s = entrada.nextInt();
                }
            }
        }
}
