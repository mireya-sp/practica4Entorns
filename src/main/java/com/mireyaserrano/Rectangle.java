package com.mireyaserrano;

public class Rectangle {
    public static void calculateArea() {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = Double.parseDouble(Libreria.scanner.nextLine());
        System.out.print("Ingrese la altura del rectángulo: ");
        double height = Double.parseDouble(Libreria.scanner.nextLine());
        double area = base * height;
        System.out.println("El área del rectángulo es: " + area);
    }
}
