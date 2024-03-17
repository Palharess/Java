package modelo.umpramuitos.teste;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
        DAO<Pedido> dao = new DAO<>(Pedido.class);
        Pedido pedido = dao.obterClienteId(1);
        for(ItemPedido item: pedido.getLista()) System.out.println(item.getQtd());
    }
}
