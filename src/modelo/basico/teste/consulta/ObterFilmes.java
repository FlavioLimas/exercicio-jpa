package modelo.basico.teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.basico.muitosparamuitos.Filme;

public class ObterFilmes {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar(
            "obterFilmesNotaMaiorQue", "nota", 8.5);
        filmes.forEach(filme -> {
                System.out.println(filme.getNome() + " => " + filme.getNota());
                filme.getAtores().forEach(ator -> {
                    System.out.println(ator.getNome());
                });
            });
    }
}
