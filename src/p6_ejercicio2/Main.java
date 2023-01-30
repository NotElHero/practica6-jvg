package p6_ejercicio2;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String cmd;
        cmd = "p6_ejercicio2.Mayusculas";
        Scanner sc = new Scanner(System.in);
        String nose;

        ProcessBuilder processBuilder = new ProcessBuilder("java", cmd);
        processBuilder.directory(new File("out/production/practica6-jvg"));
        try {
            Process procesoMayusculas = processBuilder.start();
//            System.out.println("Escribe lo que quieras convertir a mayusculas: ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(procesoMayusculas.getInputStream()));
                System.out.println(bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
