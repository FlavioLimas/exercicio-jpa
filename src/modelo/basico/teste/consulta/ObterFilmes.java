package modelo.basico.teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.basico.muitosparamuitos.Filme;

public class ObterFilmes {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>();
        List<Filme> filmes = dao.consultas(
            "obterFilmesNotaMaiorQue", "nota", 8.5);
        filmes.forEach(filme -> {
                System.out.println(filme.getNome());
            });
    }
}
