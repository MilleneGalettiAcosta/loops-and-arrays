package dio.sets;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);
        System.out.println(notas.toString());

//        Não podemos trabalhar com posição no set, procurar o indice, adicionar, remover.

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a SOMA: ");
        int soma = 0;
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média "  + (soma/notas.size()));

        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);
//        Remove apenas o valor e não com a posição

        System.out.println("Remova notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("Exiba em forma crecente: ");
        Set<Double> notas3 = new TreeSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas3);

        System.out.println("APAGUE O CONJUNTO");
        notas.clear();
        System.out.println(notas);
        System.out.println("Está vazio?");
        System.out.println("Vazio: " + notas.isEmpty());
        System.out.println("Vazio: " + notas2.isEmpty());
    }
}
