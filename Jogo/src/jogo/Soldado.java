package jogo;

public class Soldado extends Humano {

    public Soldado(int Inteligencia, int Velocidade , int Equipamentos) {
        super(Inteligencia, Velocidade , Equipamentos);
    }   
    
    @Override
    public String PrintarClasse() {
	return "Soldado";
    }
}
