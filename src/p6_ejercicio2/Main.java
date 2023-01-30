package p6_ejercicio2;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String mayusClass;
        mayusClass = "p6_ejercicio2.Mayusculas";
        Scanner sc = new Scanner(System.in);

        ProcessBuilder processBuilder = new ProcessBuilder("java", mayusClass);
        //Esta practica esta hecha con IntelliJ, si no funciona hay que cambiar el pathname a "bin"
        processBuilder.directory(new File("out/production/practica6-jvg"));

        while (true)
        try {
            Process procesoMayusculas = processBuilder.start();
            System.out.println("Escribe lo que quieras convertir a mayusculas: ");

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(procesoMayusculas.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(procesoMayusculas.getInputStream()));

            bufferedWriter.write(sc.nextLine() + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();

            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
