package ordenando;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenando {


    public static void main(String[] args) {
        ArrayList<Pessoa> Vetor = new ArrayList<Pessoa>(); 
        
        Pessoa P1 = new Pessoa("Ana",30);
        Pessoa P2 = new Pessoa("Lucia",20);
        Pessoa P3 = new Pessoa("Cristian",10);
        Pessoa P4 = new Pessoa("Alex",9);
        Vetor.add(P1);
        Vetor.add(P2);
        Vetor.add(P3);
        Vetor.add(P4);
        
        Collections.sort(Vetor);
        
        for(Pessoa p : Vetor){
            System.out.println(p.toString() );
        }
    }
    
}
