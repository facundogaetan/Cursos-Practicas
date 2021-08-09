package Tareas;

import java.util.Scanner;

public class TareaLibreria {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;

        System.out.println("Proporciona el nombre");
        nombre = teclado.nextLine();

        System.out.println("Proporciona el id");
        id = teclado.nextInt();

        System.out.println("Proporciona el precio");
        precio = teclado.nextDouble();

        System.out.println("Proporciona el envio gratuito");
        envioGratuito = teclado.nextBoolean();

        System.out.println(nombre + " " + id);
        System.out.println("Precio: " + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);

    }

}
