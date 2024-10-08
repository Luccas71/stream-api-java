package exemples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

//        Consumer<Integer> imprimirNumerosPares = numero -> {
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//        };
//        numeros.stream().forEach(imprimirNumerosPares);

        // simplificando
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
