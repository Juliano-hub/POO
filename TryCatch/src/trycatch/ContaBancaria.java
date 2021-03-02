package trycatch;

public class ContaBancaria {
        public static void main(String[] args) {
    int saldo = 3000, valor = 4000;
    
            System.out.println("Saldo:" + saldo + " Saque:" + valor);
            
    // instancia e chama o metodo void
    ContaBancaria Chamar = new ContaBancaria();
    saldo = Chamar.Sacar(valor, saldo);
    // ---------------------------------------
        }
        
public int Sacar(int valor, int saldo){
    
    if (valor > saldo) {
        throw new InsufficientFundsException( "Saque de " + valor + " excede o saldo de " + saldo);
        
    }else{
        saldo = saldo - valor;
                System.out.println("Saque efetuado com sucesso!!!");
                System.out.println("Saldo atual:" + saldo + " valor do saque efetuado:" + valor);

                return saldo;
        }

        }

}
