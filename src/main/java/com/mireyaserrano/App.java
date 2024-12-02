package com.mireyaserrano;

public class App {
    public static void main(String[] args) throws Exception {
        int option;
        do {
            option = 0;
            System.out.println("Calculadora de Área by Mireya");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Trapecio");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            option = Integer.parseInt(Libreria.scanner.nextLine());
            switch (option) {
                case 1:
                    Circle.calculateArea();
                    break;
                case 2:
                    Square.calculateArea();
                    break;
                case 3:
                    Triangle.calculateArea();
                    break;
                case 4:
                    Rectangle.calculateArea();
                    break;
                case 5:
                    Pentagon.calculateArea();
                    break;
                case 6:
                    Trapeze.calculateArea();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;    
                default:
                    System.err.println("Opción no válida");
            }
        } while (option != 0);
    }
}
