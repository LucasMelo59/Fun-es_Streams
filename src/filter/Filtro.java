package filter;

import Aluno.Alunos;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Filtro {
    public static void main(String[] args) {
        Alunos alunos = new Alunos("joao", 9.0);
        Alunos alunos2 = new Alunos("Joy", 12.0);
        Alunos alunos3 = new Alunos("davidj", 5.0);
        Alunos alunos4 = new Alunos("jgustavo", 4.0);
        Alunos alunos5 = new Alunos("lejticia", 10.0);
        Alunos alunos6 = new Alunos("jose", 7.0);

        List<Alunos> listaDeAlunos = Arrays.asList(alunos,alunos2,alunos3,alunos4,alunos5,alunos6);


        listaDeAlunos.stream()
                .filter(a -> a.nota >= 7 )
                .filter(a-> a.nome.contains("j"))
                .map(a -> "parabens!" + a.nome)
                .forEach(System.out::println);

    }
}
