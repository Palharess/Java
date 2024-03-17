package collections;

import java.util.HashSet;

public class Conjunto {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet(); // Nao suporta tipos primitivos
        conjunto.add(1.2); // double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        System.out.println("Tamanho: " + conjunto.size());
    }
}
