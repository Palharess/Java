package entity;

import jakarta.persistence.*;

@Entity
@Table(schema = "aplicando")
public class Pessoas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String cpf;
    @OneToOne()
    private Casa casa;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Pessoas(){};
    public Pessoas(String nome, String cpf, String email, Casa casa){
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.casa = casa;
    }

}
