package dio.sets;

/*
Dados as informações sobre series favoritas
Crie um conjunto e ordene esse conjunto exibindo:
(nome - genero - tempo de espisodio);

Série 1 = nome: got, genero: fantasia, duracao: 60
Série 2 = nome: dark, genero: drama, duracao: 60
Série 3 = nome: that '70s show, genero: comedia, duracao: 25
 */

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getDuracao() );

        System.out.println("Ordem de inserção: ");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getDuracao() );


        System.out.println("Ordem Natural - Duração: ");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getDuracao() );
        System.out.println(minhasSeries3);
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer duracao;

    public Serie(String nome, String genero, Integer duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && duracao.equals(serie.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracao);
    }

    @Override
    public int compareTo(Serie serie) {
        int duracao =  Integer.compare(this.getDuracao(), serie.getDuracao());
        if (duracao != 0) return duracao;

        int genero = this.getGenero().compareTo(serie.getGenero());
        return genero;
    }
}