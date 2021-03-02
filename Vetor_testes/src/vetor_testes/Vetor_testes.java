
package vetor_testes;

public class Vetor_testes {
    
public static void main(String[] args) {
int valores[] = {10, 20, 30, 40, 50, 60};
System.out.println("O tamanho: " + valores.length);
valores[1]= 25;
valores[3]= 45;
// imprimindo valores
for(int i=0; i<valores.length; i++){
System.out.println(valores[i]);
}
}
}