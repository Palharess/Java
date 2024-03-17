package modelo.umpramuitos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data;
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> lista;

    public List<ItemPedido> getLista() {
        return lista;
    }

    public void setLista(List<ItemPedido> lista) {
        this.lista = lista;
    }

    public Pedido(){
        this(new Date());
    }

    public Pedido(Date data){
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
