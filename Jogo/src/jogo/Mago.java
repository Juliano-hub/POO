package jogo;

public class Mago extends Orc {
    
    public Mago(int Forca, int Habilidade, int Agilidade) {
        super(Forca, Habilidade, Agilidade);
    }     
    
    @Override
    public String PrintarClasse() {
	return "Mago";
    }
}
