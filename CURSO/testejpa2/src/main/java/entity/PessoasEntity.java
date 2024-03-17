package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoas", schema = "curso_java")
public class PessoasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codigo")
    private int codigo;
    @Basic
    @Column(name = "nome")
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PessoasEntity that = (PessoasEntity) o;

        if (codigo != that.codigo) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        return result;
    }
}
