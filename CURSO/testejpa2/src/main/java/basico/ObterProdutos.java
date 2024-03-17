package basico;

import entity.Produto;
import infra.ProdutoDAO;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();

        List<Produto> lista = dao.obterTodos(3,0);

    }
}
