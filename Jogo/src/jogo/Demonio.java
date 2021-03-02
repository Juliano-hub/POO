package jogo;

public class Demonio extends Orc {
    
    public Demonio(int Forca, int Habilidade, int Agilidade) {
        super(Forca, Habilidade, Agilidade);
    }   
    
    @Override
    public String PrintarClasse() {
	return "Demonio";
    }
}
