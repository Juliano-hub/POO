package jogo;

public class Arqueiro extends Humano {

    public Arqueiro(int Inteligencia, int Velocidade , int Equipamentos) {
        super(Inteligencia, Velocidade , Equipamentos);
    }
    
    @Override
    public String PrintarClasse() {
	return "Arqueiro";
    }
}
