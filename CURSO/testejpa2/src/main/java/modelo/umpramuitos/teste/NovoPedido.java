package modelo.umpramuitos.teste;

import entity.Produto;
import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();
        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira", 500.1);

        ItemPedido item = new ItemPedido(pedido,produto,10);
        dao.abrirT().incluir(produto).incluir(pedido).incluir(item).fecharT().fechar();
    }
}
