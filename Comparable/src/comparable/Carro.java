package comparable;

public class Carro implements Comparable {
    private String modelo;
    private int placa;

    public Carro(String Modelo, int Placa){
        this.modelo = Modelo;
        this.placa = Placa;
    }
    
    public String toString(){
        return (this.modelo + " " + this.placa);
    }
    
    public int GetPlaca(){
        return this.placa;
    }
 
    public int compareTo(Object o){
        Carro c = (Carro) o;
        if(this.placa < c.GetPlaca() )
            return -1;
        else {
            if (this.placa > c.GetPlaca() )
                return 1;
            else
                return 0;
        }
    }
    
    
}

