package FaztudoAq;

import br.api.Calculadora;

import java.util.ServiceLoader;

public class Teste{
    public static void main(String[] args) {
        Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
        System.out.println(calc.soma(1,2,3,4));
    }
}


