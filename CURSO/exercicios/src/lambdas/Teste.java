package lambdas;


import java.util.function.BinaryOperator;

public class Teste {
    public static void main(String[] args) {

        BinaryOperator<Double> s = (x, y) -> {
            return  x + y;
        };
        double b = s.apply(1.0,2.5);
        System.out.println(b);
    }
}
