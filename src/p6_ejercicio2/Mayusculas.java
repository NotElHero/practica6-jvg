package p6_ejercicio2;

import java.io.*;

public class Mayusculas{
    public static void main(String[] args) {
        String cadenaMayus;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            cadenaMayus = bufferedReader.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cadenaMayus.toUpperCase());
    }
}
