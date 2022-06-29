package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Produto p1 = new Produto("chocolate", 2.60, 0.30 );
        Produto p2 = new Produto("leite", 5.60, 0.30 );
        Produto p3 = new Produto("leite condensado", 12.60, 0.30 );
        Produto p4 = new Produto("maizena", 50.60, 0.50 );
        Produto p5 = new Produto("licor", 45.60, 0.20 );
        Produto p6 = new Produto("bolsa", 43.60, 0.10 );

        List<Produto> lista = Arrays.asList(p1,p2,p3,p4,p5,p6);
        Predicate<Produto> list = a-> a.preco>=2 && a.desconto == 0.30;
        lista.stream()
                //.filter(list)...... funciona de ambas maneiras
                .filter(a-> a.preco >= 2 && a.desconto == 0.30)
                .map(a -> "Produto com fretes gratis e desconto: " + a.nome + " R$" +a.preco)
                .forEach(System.out::println);
    }
}
