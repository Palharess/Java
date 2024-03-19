package basic;

import entity.Pessoas;
import infra.DAO;

public class AcharDados {
    public static void main(String[] args) {
        DAO<Pessoas> dao = new DAO<>(Pessoas.class);
       Pessoas pessoa = dao.obterClienteId(1);
       System.out.println(pessoa.getCasa().getEndereco());
    }
}
