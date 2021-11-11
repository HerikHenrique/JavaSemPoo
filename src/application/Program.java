package application;

import application.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
//Exercício resolvido sem Orientação a Objetos
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Entre com os valores dos Triangulos X: ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        double areaX = x.area();

        System.out.println("Entre com as medidas do Triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaY = y.area();

        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A Area do Triangulo X é maior");
        } else {
            System.out.println("A Area do Triangulo Y é maior");
        }
        sc.close();
    }

}

