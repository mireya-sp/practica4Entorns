package com.mireyaserrano;

public class Triangle {
    public static void calculateArea() {
        System.out.print("Ingrese la base del triángulo: ");
        double base = Double.parseDouble(Libreria.scanner.nextLine());
        System.out.print("Ingrese la altura del triángulo: ");
        double height = Double.parseDouble(Libreria.scanner.nextLine());
        double area = 0.5 * base * height;
        System.out.println("El área del triángulo es: " + area);
    }
}
