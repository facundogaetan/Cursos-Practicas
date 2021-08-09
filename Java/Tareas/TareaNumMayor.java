package Tareas;

import java.util.Scanner;

public class TareaNumMayor {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Proporciona el numero 1");
        int num1 = teclado.nextInt();

        System.out.println("Proporciona el numero 2");
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " Es mayor que " + num2);
        } else {
            System.out.println(num2 + " Es mayor que " + num1);
        }

    }

}
