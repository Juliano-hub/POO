package jogo;

public abstract class Humano extends Personagem {
     private int Inteligencia;
     private int Velocidade;
     private int Equipamentos;
    
    public Humano(int Inteligencia, int Velocidade, int Equipamentos){
        super.SetVida(100);
        this.Inteligencia = Inteligencia;
        this.Velocidade = Velocidade;
        this.Equipamentos = Equipamentos;
    }

    public int GetInteligencia(){
        return this.Inteligencia;
    }

    public int GetVelocidade(){
        return this.Velocidade;
    }

    public int GetEquipamentos(){
        return this.Equipamentos;
    }     
    
     @Override
    public String toString(){
        return "Humano--" + this.PrintarClasse() + ":" + "/inteligencia:" + this.GetInteligencia() + "/velocidade:" + this.GetVelocidade() + "/Equipamentos:" + this.GetEquipamentos();
    }
    
    public abstract String PrintarClasse();
    
}


