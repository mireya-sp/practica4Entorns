package com.mireyaserrano;

public class Trapeze {
    public static void calculateArea() {
        System.out.print("Ingrese la base mayor del trapecio: ");
        double bigBase = Double.parseDouble(Libreria.scanner.nextLine());
        System.out.print("Ingrese la base menor del trapecio: ");
        double littleBase = Double.parseDouble(Libreria.scanner.nextLine());
        System.out.print("Ingrese la altura del trapecio: ");
        double height = Double.parseDouble(Libreria.scanner.nextLine());
        double area = ((bigBase + littleBase) / 2) * height;
        System.out.println("El área del trapecio es: " + area);
    }
}
