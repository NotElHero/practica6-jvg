package p6_ejercicio2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process mayusculas;

        try{
            mayusculas = runtime.exec("notepad.exe");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
