package fruta;
public class Classe_Frutas {
private String cor;
private int valor;
private int peso;
private int valor_peso;
private static int quantidade=0;

    public Classe_Frutas(String C, int A, int B){
        this.cor = C;
        this.valor = A;
        this.peso = B;
        this.valor_peso = 0;
        this.quantidade++;
    }


        // metodos
     void Valor_por_peso(){
        this.valor_peso = this.valor*this.peso;
        //return valor_peso;
    }
    
     void Printar(){    
        System.out.println("Cor:" +this.cor);
        System.out.println("Valor:" +this.valor);
        System.out.println("Peso:" +this.peso);
        System.out.println("Valor por peso:" +this.valor_peso);
         System.out.println("");
    }
    
     void Quantidade(){
        System.out.println("Quantidade total de frutas:" +quantidade);   
    }
    
    
}
