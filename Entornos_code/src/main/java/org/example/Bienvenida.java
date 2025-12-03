package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bienvenida {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int num = 0;
        String nombre = "";
        boolean control = false;


        do {
            try {
                System.out.println("Introduce la cantidad de personas que no conoce...");
                num = teclado.nextInt();
                control = true;
            }catch (Exception e){
                System.out.println("Valores introducidos inocrretos");
            }
        }while (control==false);

        for (int i = 1; i <= num; i++) {
            System.out.print("Soy ");
            nombre = teclado.next();
        }

        System.out.println(nombre);






    }
    static int multiplicacion() {

        return 0;
    }
}
