package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Bienvenida {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int num = 0;
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

        String nombre[] = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Soy ");
            nombre[i] = teclado.next();
        }

        for (int i = 0; i < num; i++) {
            System.out.println("Hola, " + nombre[i]);
        }
    }
}
