package com.mireyaserrano;

import java.util.Scanner;

public class Libreria {
    public final static Scanner scanner = new Scanner(System.in);
    public static void dispose(){
        scanner.close();
    }
}
