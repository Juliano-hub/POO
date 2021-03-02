package trycatch;

import java.io.*;
public class TryCatch {
    
public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new
    InputStreamReader(System.in));
    System.out.println("Quantos anos voce tem ?");
    int idade = read(in);
    idade++;
    System.out.println("No proximo ano voce tera: " + idade);
}

public static int read(BufferedReader input) throws IOException {
    String inputLine = input.readLine();
    return Integer.parseInt(inputLine);
}

}