package Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {


        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        /*
        1. Número para String binária ... 6=> "110"
        2. Inverter a String... "110" => "011"
        3. converter de volta para inteiro  => "011" => 3
         */

        Consumer<Object> print = System.out::println;
        Function< Integer, String> inteiroPString = n-> Integer.toBinaryString(n);
        UnaryOperator<String> inverte = n-> new StringBuilder(n).reverse().toString();
        Function <String, Integer > stringPInteiro = n -> Integer.parseInt(n , 2);

        numbs.stream()
                .map(inteiroPString)
                .map(inverte)
                .map(stringPInteiro)
                .forEach(print);


        System.out.println("outra maneira");

        numbs.stream()
                .map(Integer::toBinaryString)
                .map(inverte)
                .map(stringPInteiro)
                .forEach(System.out::print);

    }
}
