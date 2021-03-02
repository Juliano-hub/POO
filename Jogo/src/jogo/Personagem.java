package jogo;

public abstract class Personagem {
    private int Vida;
    
    // passa um valor para o Get, pois assim também vai modificar quando for chamado na Batalha
    public void SetVida(int VidaQuant){
        this.Vida = VidaQuant;
    }
    
    public int GetVida(){
        return this.Vida;
    }
    
}
