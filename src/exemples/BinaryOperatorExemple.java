package exemples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemple {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 5, 10);

        //Usar binary operator para somar dois inteiros
        BinaryOperator<Integer> somar = Integer::sum;

//        int resultado = numeros.stream()
//                .reduce(0, somar);

        //utilizando lambda
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("O resultado da soma é: " + resultado);
    }
}
