package infra;

import entity.Produto;

public class ProdutoDAO extends DAO<Produto>{

    public ProdutoDAO(){
        super(Produto.class);
    }

}
