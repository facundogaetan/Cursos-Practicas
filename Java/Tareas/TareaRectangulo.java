package Tareas;
import java.util.Scanner;

public class TareaRectangulo {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int alto;
        int ancho;

        System.out.println("Proporciona el alto:");
        alto = teclado.nextInt();

        System.out.println("Proporciona el ancho");
        ancho = teclado.nextInt();

        //formulas
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}

