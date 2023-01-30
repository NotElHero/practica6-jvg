package p6_ejercicio2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String minusculas;
        String cmd;
        cmd = "java Mayusculas.java";
        Scanner sc = new Scanner(System.in);
        File file = new File("Mayusculas.java");

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);
        Process procesoMayusculas;
        System.out.println("Escribe lo que quieras convertir a mayusculas: ");
        minusculas = sc.next();
        try {
            processBuilder.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
