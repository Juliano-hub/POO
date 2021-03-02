package jogo;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {

    public static void main(String[] args) {
        int TamanhoTotal = 100;
        int i=0, ValorAleatorio=0, VitoriaOrc=0, VitoriaHumano=0, Empate=0, VidaTotalOrc=0, VidaTotalHumano=0;
        
        // cria os vetores
        ArrayList<Humano> VetorHumano = new ArrayList<>(TamanhoTotal);
        ArrayList<Orc> VetorOrc = new ArrayList<>(TamanhoTotal);
        
        
        for(i = 0; i < TamanhoTotal; i++){
            System.out.println("Batalha numero:" + i);
            
            // Gera o Orc------------------------
            
            // instância para o valor aleatório
            Random Aleatorio = new Random();            
            ValorAleatorio = Aleatorio.nextInt(3);
            
            // switch para a classe gerada aleatória
            switch(ValorAleatorio){
                // faz uma instância conforme o valore aleatório gerado e depois adiciona o dado no vetor com o .add
                case 0:
                    VetorOrc.add( new Ogro(60, 60, 20) );
                break;
                case 1:
                    VetorOrc.add( new Mago(20, 80, 40) );                
                break;                
                case 2:
                    VetorOrc.add( new Demonio(80, 20, 60) );                       
                break;
            }
        
            // Gera o Humano------------------------
            ValorAleatorio = Aleatorio.nextInt(3);

            // switch para a classe gerada aleatória       
            switch(ValorAleatorio){
                case 0:
                    VetorHumano.add( new Soldado(20, 80, 40) );
                break;
                case 1:
                    VetorHumano.add( new Arqueiro(60, 60, 20) );                
                break;                
                case 2:
                    VetorHumano.add( new Robo(80, 20, 60) );                       
                break;
            }
            
            // pega a posição atual usando o get(i) como indice e chamando o .toString para printar os dados
            System.out.println( VetorOrc.get(i).toString() + " ----- " + VetorHumano.get(i).toString() );
            
            // chama m método batalha
            Jogo.Batalha(VetorHumano, VetorOrc, i);
            System.out.println();
            
        }// laço do 0 a 100
    
        
        // laço percorrendo todo o vetor para fazer as contas 
        for(i = 0; i < TamanhoTotal; i++){
            // os "VidaTotal" recebem a vida da Nodo da posição atual, para ir somando e printar no final
            VidaTotalOrc = VidaTotalOrc + VetorOrc.get(i).GetVida();    
            VidaTotalHumano = VidaTotalHumano + VetorHumano.get(i).GetVida();
            
            // testa oque aconteceu na batalha conforme a vida dos 2 Nodos
            if( VetorOrc.get(i).GetVida() == VetorHumano.get(i).GetVida() ){
                Empate++;
            }else if( VetorOrc.get(i).GetVida() < VetorHumano.get(i).GetVida() ){
                VitoriaHumano++;
            }else{
                VitoriaOrc++;
            }
            
        }// laço do 0 a 100

        
            // printa a soma das vidas dos 2 vetores
            System.out.println("Vida total dos Humanos:" + VidaTotalHumano +" ----- Vida total dos Orcs:" + VidaTotalOrc);
            
            // printa a quantidade de vitórias dos 2 vetores
            System.out.println("//Vitoria dos Humanos:" + VitoriaHumano + " //Vitoria dos Orcs:" + VitoriaOrc + " //Total de empates:" + Empate);
        
            // verifica quem ganhou e printa os dados
            if(VitoriaHumano == VitoriaOrc ){
                
                    System.out.println("Houve um empate nas quantidades de vitorias!!!");
                    
                if( VidaTotalHumano > VidaTotalOrc ){
                    System.out.println("Os humanos ganharam com um diferença de:" + (VidaTotalHumano - VidaTotalOrc) + " vida" );
                }else if( VidaTotalHumano < VidaTotalOrc ){
                    System.out.println("Os Orcs ganharam com um diferença de:" + (VidaTotalOrc - VidaTotalHumano) + " vida");          
                }else{
                    System.out.println("Houve um empate na quantidade de vida!!!");
                }
                
            }else if( VitoriaHumano > VitoriaOrc ){
                System.out.println("Os humanos ganharam com um diferença de:" + (VidaTotalHumano - VidaTotalOrc) + " vida");
                System.out.println("Os humanos ganharam com um diferença de:" + (VitoriaHumano - VitoriaOrc) + " Vitoria(s)");
            }else{
                System.out.println("Os Orcs ganharam com um diferença de:" + (VidaTotalOrc - VidaTotalHumano) + " vida");
                System.out.println("Os Orcs ganharam com um diferença de:" + (VitoriaOrc - VitoriaHumano) + " Vitoria(s)");
            }
            
            
    }
  
    private static void Batalha(ArrayList<Humano> HumanoAux, ArrayList<Orc> OrcAux, int PAtual){
        int ValorAleatorio=0, AtaqueOrc=0, AtaqueHumano=0, Diferenca=0;
        
        // gera o ataque do Orc
        
        // instância para o valor aleatório        
        Random Aleatorio = new Random();
        ValorAleatorio = Aleatorio.nextInt(3);
        
        // switch para o ataque gerado aleatóriamente
        switch(ValorAleatorio){
            case 0:
                AtaqueOrc = OrcAux.get(PAtual).GetForca();
                // pega a posição atual usando o get(PAtual) como indice e chamando o .toPrintarClasse para printar o tipo da classe do dado atual
                // também usa isso para pegar o valor do dado da posição atual
                System.out.println("-----O " + OrcAux.get(PAtual).PrintarClasse() + " usou Força(" + OrcAux.get(PAtual).GetForca() + ")");
            break;
                
            case 1:
                AtaqueOrc = OrcAux.get(PAtual).GetHabilidade();
                System.out.println("-----O " + OrcAux.get(PAtual).PrintarClasse() + " usou Habilidade(" + OrcAux.get(PAtual).GetHabilidade() + ")");
            break;  
            
            case 2:
                AtaqueOrc = OrcAux.get(PAtual).GetAgilidade();   
                System.out.println("-----O " + OrcAux.get(PAtual).PrintarClasse() + " usou Agilidade(" + OrcAux.get(PAtual).GetAgilidade() + ")");                
            break;
            }
        
        // gera o ataque do Humano
        ValorAleatorio = Aleatorio.nextInt(3);

        // switch para o ataque gerado aleatóriamente        
        switch(ValorAleatorio){
            case 0:
                AtaqueHumano = HumanoAux.get(PAtual).GetInteligencia();   
                System.out.println("-----O " + HumanoAux.get(PAtual).PrintarClasse() + " usou Inteligencia(" + HumanoAux.get(PAtual).GetInteligencia() + ")");                    
            break;
            
            case 1:
                AtaqueHumano = HumanoAux.get(PAtual).GetVelocidade();
                System.out.println("-----O " + HumanoAux.get(PAtual).PrintarClasse() + " usou Velocidade(" + HumanoAux.get(PAtual).GetVelocidade() + ")");                        
            break;              
            
            case 2:
                AtaqueHumano = HumanoAux.get(PAtual).GetEquipamentos();
                System.out.println("-----O " + HumanoAux.get(PAtual).PrintarClasse() + " usou Equipamentos(" + HumanoAux.get(PAtual).GetEquipamentos() + ")");        
            break;
            }
        
        // apos escolher os ataques
        
        // diferença recebe a diferença entre os 2 ataques
        Diferenca = AtaqueOrc - AtaqueHumano;
        
        if(Diferenca == 0){
           System.out.println("----------Houve um empate!!");
        }else if(Diferenca > 0){
           System.out.println("----------O " + OrcAux.get(PAtual).PrintarClasse() + " venceu com uma diferença de:" + Diferenca);
            
           // diminui na vida do Humano do Nodo atual
           HumanoAux.get(PAtual).SetVida( HumanoAux.get(PAtual).GetVida() - Diferenca );
        }else{
           // inverte o valor para positivo
           Diferenca = Diferenca*(-1);
           System.out.println("----------O " + HumanoAux.get(PAtual).PrintarClasse() + " venceu com uma diferença de:" + Diferenca);  
            
           // diminui na vida do Orc do Nodo atual
           OrcAux.get(PAtual).SetVida( OrcAux.get(PAtual).GetVida() - Diferenca );
        }
    }
    
       
}