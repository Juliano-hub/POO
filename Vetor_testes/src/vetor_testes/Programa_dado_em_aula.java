package vetor_testes;

import java.util.ArrayList;

public class Programa_dado_em_aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Aluno> arrayAlunos = new ArrayList<Aluno>();

Aluno aluno1 = new Aluno("Paulo", 44, 1);
arrayAlunos.add(aluno1);

arrayAlunos.add(new Aluno("Lisane", 43, 2));


for (Aluno tempAluno : arrayAlunos){
tempAluno.imprimir();
System.out.println();
}

//arrayAlunos.remove(aluno1);

//arrayAlunos.remove();

System.out.println("-------- \n");

Aluno temp = new Aluno(null, 0, 0);
for (Aluno tempAluno : arrayAlunos){
if (tempAluno.nome.equals("Lisane"))
temp = tempAluno;
}
arrayAlunos.remove(temp);


for (Aluno tempAluno : arrayAlunos){

tempAluno.imprimir();
System.out.println();

}
    }
    
}
