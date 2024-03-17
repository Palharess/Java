package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Consumer <String> p = a ->{
            System.out.print(a + " ");
        };
        UnaryOperator<String> reverse = (s) ->{
            StringBuilder nova = new StringBuilder(s.length() + 1);
            for(int i = s.length() - 1; i>=0; i--){
                nova.append(s.charAt(i));
            }
            return nova.toString();
        };
        lista.stream().map(Integer::toBinaryString).forEach(p);
        System.out.print('\n');
        lista.stream().map(Integer::toBinaryString).map(reverse).forEach(p);
    }
}
