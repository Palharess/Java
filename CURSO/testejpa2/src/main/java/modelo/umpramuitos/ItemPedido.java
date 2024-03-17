package modelo.umpramuitos;

import entity.Produto;
import jakarta.persistence.*;


@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int qtd;
    private Double preco;
    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Produto produto;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ItemPedido(){}
    public  ItemPedido(Pedido pedido, Produto produto, int qtd){
        this.qtd = qtd;
        this.pedido = pedido;
        this.produto = produto;
        this.preco = produto.getPreco();


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
