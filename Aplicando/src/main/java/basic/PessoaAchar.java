package basic;

import entity.Pessoas;
import infra.DAO;

import java.sql.ResultSet;
import java.util.List;

public class PessoaAchar {
    public static void main(String[] args) {
        DAO<Pessoas> dao = new DAO<>(Pessoas.class);
        List<Pessoas>  lista = dao.obterTodos(1, 0);
        System.out.println(lista.get(0).getNome());
        dao.fechar();
    }
}
