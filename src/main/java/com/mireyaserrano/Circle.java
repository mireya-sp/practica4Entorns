package com.mireyaserrano;

public class Circle {
    public static void calculateArea() {
        System.out.print("Ingrese el radio del círculo: ");
        double radius = Double.parseDouble(Libreria.scanner.nextLine());
        double area = Math.PI * radius * radius;
        System.out.println("El área del círculo es: " + area);
    }
}
