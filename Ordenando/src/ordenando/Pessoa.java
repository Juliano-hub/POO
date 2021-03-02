package ordenando;

public class Pessoa implements Comparable<Pessoa>{
    protected String nome;
    protected int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    @Override
    public int compareTo(Pessoa AUX) {
        if(this.idade < AUX.getIdade()){
            return -1;
        }else if(this.idade > AUX.getIdade()){
            return 1;
        }
        return 0;
    }
    
    public String toString(){
        return "Nome:" + nome + ", idade:" + idade;
    }
    
}
