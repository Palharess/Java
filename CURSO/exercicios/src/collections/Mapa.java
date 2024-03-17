package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Roberto");

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.println("Key: "+ registro.getKey() + " / Valor: " + registro.getValue());
        }
    }
}
