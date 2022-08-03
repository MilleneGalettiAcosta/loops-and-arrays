package dio.maps;

/*
Dadas as seguintes informações sobre livros
Crie um dicionario
Ordene ( autor - livro);

autor = Hawking, Stephen - livro = nome: Uma breve historia do tempo páginas 256
autor: Duhigg, CHarles Livro =  nome: o Poder do Hábito , paginas: 408
autor Harari, Yuval Naah Livro = nome 21 Lições para seculo 21, paginas: 432
 */

import java.sql.SQLOutput;
import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário: ");
        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
           put("Harari, Yuval Naah", new Livro("21 Lições para seculo 21", 432));
           put("Duhigg, CHarles", new Livro("o Poder do Hábito", 408));
        }};

        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("Ordem de inserção: ");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(meusLivros);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem natural autores: ");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros);
        for(Map.Entry<String, Livro> livro : meusLivros3.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem alfabética dos livros: ");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros.entrySet());
        System.out.println(meusLivros4);

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}