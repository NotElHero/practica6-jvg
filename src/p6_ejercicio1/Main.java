package p6_ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sumaClass;
        sumaClass = "p6_ejercicio1.Suma";
        Scanner sc = new Scanner(System.in);

        ProcessBuilder processBuilder = new ProcessBuilder("java", sumaClass);
        processBuilder.directory(new File("out/production/practica6-jvg"));

        try {
            Process procesoSuma = processBuilder.start();

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(procesoSuma.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(procesoSuma.getInputStream()));

            System.out.println(bufferedReader.readLine());
            bufferedWriter.write(sc.nextLine() + "\n");
            bufferedWriter.flush();

            System.out.println(bufferedReader.readLine());
            bufferedWriter.write(sc.nextLine() + "\n");
            bufferedWriter.flush();

            bufferedWriter.close();

            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}