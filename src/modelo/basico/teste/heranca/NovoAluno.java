package modelo.basico.teste.heranca;

import infra.DAO;
import infra.modelo.heranca.Aluno;
import infra.modelo.heranca.AlunoBolsista;

public class NovoAluno {

    public static void main(String[] args) {
        DAO<Aluno> alunoDAO = new DAO<>(Aluno.class);

        Aluno aluno = new Aluno(123L, "Julio");
        AlunoBolsista alunoBolsista = new AlunoBolsista(345L, "Ana", 1000.);

        alunoDAO.incluirAtomico(aluno);
        alunoDAO.incluirAtomico(alunoBolsista);
        alunoDAO.fechar();
    }
    
}
