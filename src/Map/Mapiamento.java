package Map;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Mapiamento {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("audi", "bmw", "honda");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);


        UnaryOperator<String> maiuscula = n-> n.toUpperCase();
        UnaryOperator<String> primeiraletra = n -> n.charAt(0)+ "";
        UnaryOperator<String> grito = n -> n + "!!";

        // usando composição
        marcas.stream()
                .map(maiuscula)
                .map(primeiraletra)
                .map(grito)
                .forEach(print);


    }
}
