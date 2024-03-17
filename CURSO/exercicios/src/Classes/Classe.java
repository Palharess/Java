package Classes;

public class Classe {
    String nome;
    Double preco;
    double desconto;

    public boolean equals(Object obj) {
        Classe outro = (Classe) obj;
        return outro.nome.equals(this.nome) && outro.preco.equals(this.preco);
    }
}
