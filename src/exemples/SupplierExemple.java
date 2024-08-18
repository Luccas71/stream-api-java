package exemples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemple {
    public static void main(String[] args) {

//        Supplier<String> saudacao = () -> "Ola, seja bem vindo(a)!";
//
//        List<String> listaSaudacao = Stream.generate(saudacao)
//                .limit(5)
//                .toList();

        // gerando supplier dentro do generate

        List<String> listaSaudacao = Stream.generate(() -> "Ola, seja bem vindo(a)!")
                .limit(3)
                .toList();

        listaSaudacao.forEach(System.out::println);
    }
}
