package p6_ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma {
    public static void main(String[] args) {
        String cadenan1 = null, cadenan2 = null;
        int n1 = 0, n2 = 0;
//        Boolean n1isNumeric = true;
//        Boolean n2isNumeric = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (cadenan1.equals(null) && cadenan1 == String.valueOf(cadenan1)) {
                System.out.println("Primer numero");
                cadenan1 = bufferedReader.readLine();

                for (int i = 0; i < cadenan1.length(); i++){
                    char c = cadenan1.charAt(i);
                    if (c < '0' || c > '9') {

                    }
                }
            }

            if (!(Integer.valueOf(n2) < 0) && !(Integer.valueOf(n2) > 9)) {
                System.out.println("Segundo numero");
                n2 = Integer.parseInt(bufferedReader.readLine());
            }
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
