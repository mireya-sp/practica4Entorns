package com.mireyaserrano;

public class Pentagon {
    public static void calculateArea() {
        System.out.print("Ingrese el lado del pentágono: ");
        double side = Double.parseDouble(Libreria.scanner.nextLine());
        System.out.print("Ingrese la apotema del pentágono: ");
        double apothem = Double.parseDouble(Libreria.scanner.nextLine());
        double area = 0.5 * 5 * side * apothem;
        System.out.println("El área del pentágono es: " + area);
    }
}
