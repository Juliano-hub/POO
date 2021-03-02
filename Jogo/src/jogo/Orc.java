package jogo;

public abstract class Orc extends Personagem{
    private int Forca;
    private int Habilidade;
    private int Agilidade;
    
    public Orc(int Forca, int Habilidade, int Agilidade){
        super.SetVida(100);
        this.Forca = Forca;
        this.Habilidade = Habilidade;
        this.Agilidade = Agilidade;
    }

    public int GetForca(){
        return this.Forca;
    }

    public int GetHabilidade(){
        return this.Habilidade;
    }

    public int GetAgilidade(){
        return this.Agilidade;
    }    
    
    @Override
    public String toString(){
        return "Orc--" + this.PrintarClasse() + ":" + "/Força:" + this.GetForca() + "/Habilidade:" + this.GetHabilidade() + "/Agilidade:" + this.GetAgilidade();
    }
    
    public abstract String PrintarClasse();
}
