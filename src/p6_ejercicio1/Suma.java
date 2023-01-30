package p6_ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma {
    public static void main(String[] args) throws IOException {
        int n1, n2;
//        Boolean n1isNumeric = true;
//        Boolean n2isNumeric = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Primer numero");
            n1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Segundo numero");
            n2 = Integer.parseInt(bufferedReader.readLine());

            System.out.println(n1 + n2);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

//    public static boolean isNumeric(String numero) {
//        try {
//            Integer.parseInt(numero);
//            return true;
//        } catch(NumberFormatException e){
//            return false;
//        }
//    }
}
