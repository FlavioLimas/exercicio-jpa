package modelo.basico.teste.muitosparamuitos;

import infra.DAO;
import modelo.basico.muitosparamuitos.Ator;
import modelo.basico.muitosparamuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        Filme anjosEDemonios = new Filme("Anjos E Demonios", 10.);
        Filme inferno = new Filme("Inferno", 8.9);
        Filme avatar = new Filme("Avatar", 10.);

        Ator tomHankis = new Ator("Tom Hanks");
        Ator ayeletZurer = new Ator("Ayelet Zurer");
        
        Ator samWorthington = new Ator("Sam Worthington");
        Ator zoeSaldana = new Ator("Zoe Saldana");
        
        anjosEDemonios.addAtor(tomHankis);
        anjosEDemonios.addAtor(ayeletZurer);

        avatar.addAtor(samWorthington);
        avatar.addAtor(zoeSaldana);
        inferno.addAtor(tomHankis);
        DAO<Filme> dao = new DAO<Filme>();
        dao.incluirAtomico(inferno);
    }
}
