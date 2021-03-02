package jogo;

public class Robo extends Humano {

    public Robo(int Inteligencia, int Velocidade , int Equipamentos) {
        super(Inteligencia, Velocidade , Equipamentos);
    }
    
    @Override
    public String PrintarClasse() {
	return "Robo";
    }
}
