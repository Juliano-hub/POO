package fruta;


public class FRUTA {


    public static void main(String[] args) {
        Classe_Frutas morango = new Classe_Frutas("vermelho",6,2);
        
       morango.Valor_por_peso();
       morango.Printar();
       
       morango.Quantidade();
       
       Classe_Frutas uva = new Classe_Frutas("roxo",10,6);
       uva.Valor_por_peso();
       uva.Printar();
       
       uva.Quantidade();
    }
    
}
