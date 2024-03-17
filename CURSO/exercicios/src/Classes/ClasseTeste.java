package Classes;

public class ClasseTeste {
    public static void main(String[] args) {
        Classe opa = new Classe();
        opa.nome = "Senhor";
        opa.preco = 10.0;

        Classe opa2 = new Classe();
        opa2.nome = "Senhor";
        opa2.preco = 11.0;
        System.out.println(opa.equals(opa2));
    }
}
