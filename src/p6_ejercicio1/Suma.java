package p6_ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma {
    public static void main(String[] args) {
        String cadenan1, cadenan2;
        int n1, n2;
        Boolean isNumeric = false;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            do {
                System.out.println("Primer numero");
                cadenan1 = bufferedReader.readLine();
            } while (isNumeric(cadenan1, isNumeric) == false);
            n1 = Integer.parseInt(cadenan1);
            isNumeric = false;

            do {
                System.out.println("Segundo numero");
                cadenan2 = bufferedReader.readLine();
             }while (isNumeric(cadenan2, isNumeric) == false);
            n2 = Integer.parseInt(cadenan2);
            System.out.println("Suma: " + (n1 + n2));

        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    public static Boolean isNumeric(String cadena, Boolean isNumeric){
        for (int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                isNumeric = true;
            } else {
                isNumeric = false;
            }
        }
        if (isNumeric == false){
            System.out.println("Introduce un numero entero");
        }
        return isNumeric;
    }
}
