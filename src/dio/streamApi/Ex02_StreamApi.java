package dio.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Ex02_StreamApi {
    public static void main(String[] args) {
        List<String> numeroAleatorios =
                Arrays.asList("1","0","1","2","3","9","9","6","5");

//        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numeroAleatorios.stream().forEach(System.out::println);
//
//        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
//        numeroAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//
//        System.out.println("Transforma esta lista String em uma lista de números inteiros: ");
//        List<Integer> numerosAleatorios1 = numeroAleatorios.stream()
//                .map(Integer::parseInt).collect(Collectors.toList());
//        System.out.println(numerosAleatorios1);
//
//        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
//        numeroAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        System.out.println("Mostre a média dos números: ");
//        numeroAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .isPresent(System.out::println);
//        System.out.println(numeroAleatorios);

//        System.out.println("Remova os valores impares");
//        numerosAleatorios1.removeIf(integer -> (interger % 2 != 0));
//        System.out.println(numeroAleatorios1);
//
//    }
}
