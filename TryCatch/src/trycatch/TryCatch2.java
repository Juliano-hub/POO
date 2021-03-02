package trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatch2{
    public static void main(String[] args) {
    try {
        BufferedReader in = new BufferedReader(new
        InputStreamReader(System.in));
        System.out.println("Quantos anos voce tem ?");
        String inputLine = in.readLine();
        int idade = Integer.parseInt(inputLine);
        idade++;
        System.out.println("No proximo ano voce tera: " + idade);
    }
        catch (IOException exception){
        System.out.println("Erro de I/O: " + exception);
    }
    }
}