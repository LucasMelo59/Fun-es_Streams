import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {


        List<String> aprovados = Arrays.asList("pablo", "lucas", "jose");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        aprovados.forEach(System.out::println);

        // usando iterator

        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        Stream<String> lista = aprovados.stream();
        lista.forEach(System.out::println);


        // -----------------------------------------------------------------------------------


        Consumer<Object> print = System.out::print;

        Stream<String> langs = Stream.of("java", "php", "python");

        langs.forEach(print);

        String[] maisLangs = {"ana", "pedro", "lucas"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        List<String> outrasLangs = Arrays.asList("c", "kotlin", "c++\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // Stream infinita
        //Stream.generate(() -> "a").forEach(print);
        //infinita
        //Stream.iterate(0, n -> n+1).forEach(print);


    }
}
