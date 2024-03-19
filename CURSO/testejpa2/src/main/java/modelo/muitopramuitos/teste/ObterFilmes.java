package modelo.muitopramuitos.teste;

import infra.DAO;
import modelo.muitopramuitos.Filme;

import java.util.List;

public class ObterFilmes {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> lista = dao.consultar("filmesNotasMaiorQue", "nota", 9.7);
        for(Filme filme:lista) System.out.println(filme.getNome());
    }
}                                                                                                                                                                                                                                                                                                                                                                           1
