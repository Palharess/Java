package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
        BinaryOperator<Integer> soma = (ac,n) -> ac + n;
        int total = lista.stream().reduce(soma).get();
        System.out.print(total);
    }
}
