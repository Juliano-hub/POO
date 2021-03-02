package jogo;

public class Ogro extends Orc {
    
    public Ogro(int Forca, int Habilidade, int Agilidade) {
        super(Forca, Habilidade, Agilidade);
    }      
    
    @Override
    public String PrintarClasse() {
	return "Ogro";
    }
}
