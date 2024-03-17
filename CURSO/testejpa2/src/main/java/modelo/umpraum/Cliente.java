package modelo.umpraum;


import jakarta.persistence.*;


@Entity
@Table(name = "clientes")
public class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String nome;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(unique = true)
    private Assento assento;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }



    public Cliente(){}

    public Cliente(String nome, Assento assento){
        this.assento = assento;
        this.nome = nome;

    }
}
