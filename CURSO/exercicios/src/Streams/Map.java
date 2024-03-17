package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        List<String> lista = Arrays.asList("A", "B", "c");
        lista.stream().map(letra -> letra.toLowerCase()).forEach(print);
    }
}
