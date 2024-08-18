package exemples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemple {
    public static void main(String[] args) {
        // retorna valor booleano
        //comumente usado em filter

        List<String> palavras = Arrays.asList("Go", "Kotlin", "C", "Java", "C++", "Javascript", "Python");

        //Predicate para verificar se as palavras tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usar Stream para filtrar e em seguida imprimir na tela
//        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

        // utilizando lambda
        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);
    }

}
