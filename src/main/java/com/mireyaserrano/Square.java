package com.mireyaserrano;

public class Square {
    public static void calculateArea() {
        System.out.print("Ingrese el lado del cuadrado: ");
        double side = Double.parseDouble(Libreria.scanner.nextLine());
        double area = side * side;
        System.out.println("El área del cuadrado es: " + area);
    }
}

