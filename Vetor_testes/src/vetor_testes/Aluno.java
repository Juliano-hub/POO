package vetor_testes;

public class Aluno extends Pessoa {
    private int matricula;
    
    public  Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        // atributos e métodos do pai, nesse caso o construtor do pai
        
        this.matricula = matricula;
        // adiciona as coisas extras do filho
    }
    
        public void imprimir(){
        super.imprimir();
        // atributos e métodos do pai
        
        System.out.println(this.matricula);
        // adiciona as coisas extras do filho
    }
}
