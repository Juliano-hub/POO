package carro_projeto;

public class Carro_projeto {
    String modelo;
    String cor;
    int ano;
    int gasolina;
    boolean ligado;

             
            public Carro_projeto(int A,int B){
            gasolina = A;
            ano = B;
            }
            
            // metodos
        void printar(){
        System.out.println("qual modelo? " + this.modelo);
        System.out.println("qual cor? " + this.cor);
        System.out.println("Qual ano? " + this.ano);
        System.out.println("Quanto de gasolina? " + this.gasolina);
        System.out.println("Está ligado? " + this.ligado);
        }
        void ligar(){
                 this.ligado = true;
                // sout para printar
                System.out.println("O carro está ligado!");    
        }
        
        void desligar(){
                      this.ligado = false;
                  // sout e depois TAB para printar
                System.out.println("O carro está desligado!");    
        }
        
        void encher(){
            if(this.gasolina != 0){
             this.gasolina = this.gasolina;

            }else{
              this.gasolina = 20;
            }
        }
        
        /// fim dos metodos
    
    public static void main(String[] args) {
              Carro_projeto A = new Carro_projeto(0,1000);
        A.modelo = "Steelix";
        A.cor = "vermelho";
        A.ligar();
        A.encher();
        A.printar();
        
        System.out.println("-----Carro 2:");
        Carro_projeto B = new Carro_projeto(4000,2000);
        B.modelo = "venusaur";
        B.cor = "Verde";
        B.encher();
        B.desligar();
        B.printar();
    }
    
}
