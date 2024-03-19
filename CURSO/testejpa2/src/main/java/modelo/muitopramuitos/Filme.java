package modelo.muitopramuitos;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "filmes", schema = "curso_java")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private double nota;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Ator> atores = new ArrayList<>();

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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
    public Filme(){};
    public Filme(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public void addAtor(Ator ator){
        if(ator != null && !getAtores().contains(ator)){
            getAtores().add(ator);
            if(!ator.getFilmes().contains(this)){
                ator.getFilmes().add(this);
            }
        }


    }
}
