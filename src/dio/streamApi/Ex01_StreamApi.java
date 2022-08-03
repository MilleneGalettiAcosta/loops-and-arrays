package dio.streamApi;

/*
Dadas informações de id e contato
Crie m dicionário (Nome id - Nome contato)

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 3333;
id = 3 - Contato = nome: Jon, numero: 5555;
 */

import java.util.*;
import java.util.function.Function;

public class Ex01_StreamApi {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 3333));
            put(3, new Contato("Jon", 5555));
        }};
//        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
//      Ordenado por inserção
        Map<Integer, Contato> agenda2 = new LinkedHashMap<>(agenda);
//        Ordenação natural
        Map<Integer, Contato> agenda3 = new TreeMap<>(agenda);

        System.out.println("Ordem número com classe anônima: ");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });
        set.addAll(agenda.entrySet());
        System.out.println(set);

        System.out.println("Ordem com método comparing: ");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));
        set2.addAll(agenda.entrySet());
        System.out.println(set2);

        System.out.println("Ordem com Lambda: ");
        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>(Comparator.comparing(
                 cont -> cont.getValue().getNumero()));
        set3.addAll(agenda.entrySet());
        System.out.println(set3);
    }

}

class Contato {
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}