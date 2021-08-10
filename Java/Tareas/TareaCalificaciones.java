package Tareas;

import java.util.Scanner;

public class TareaCalificaciones {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //el objetivo del ej es crear un sistema de calificaciones

        int nota;

        System.out.println("Ingrese un valor entre 0 y 10");
        nota = teclado.nextInt();

        if (nota >= 9 && nota <= 10) {
            System.out.println("A");
        } else if (nota >= 8 && nota < 9) {
            System.out.println("B");
        } else if (nota >= 7 && nota < 8) {
            System.out.println("C");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("D");
        } else if (nota >= 0 && nota < 6) {
            System.out.println("F");
        } else {
            System.out.println("Valor desconocido");
        }

    }

}
