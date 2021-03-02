package vetor_testes;

public class Pessoa {
    protected String nome;
    protected int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
