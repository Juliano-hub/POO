package comparable;

import java.util.Collections;
import java.util.Vector;

public class OrdenacaoCarros {
    public static void main(String[] args) {
        int Resultado = 10;
        
        Vector vectorCarros = new Vector();
        vectorCarros.add(new Carro("Corsa", 10));
        vectorCarros.add(new Carro("Chevete", 1));
        vectorCarros.add(new Carro("Kombi", 4));
        // imprimir antes da ordenacao
        System.out.println(vectorCarros);
        // Ordenar
        Collections.sort(vectorCarros);
        // imprimir apos a ordenacao
        System.out.println(vectorCarros);
  
    }
}
