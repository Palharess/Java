package modelo.muitopramuitos.teste;

import infra.DAO;
import modelo.muitopramuitos.Ator;
import modelo.muitopramuitos.Filme;

public class AtorFilme {
    public static void main(String[] args) {
        Filme filmeA = new Filme("Star wars", 9.6);
        Filme filmeB = new Filme("Game of thrones", 10.0);

        Ator atorA = new Ator("Tywin");
        Ator atorB = new Ator("Lanister");

        filmeA.addAtor(atorA);
        filmeA.addAtor(atorB);
        filmeB.addAtor(atorA);
        DAO<Filme> filmes = new DAO<>();
        filmes.incluirAtomico(filmeA);


    }
}
