package Reduce;

import Aluno.Alunos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {
    public static void main(String[] args) {

        Alunos a1 = new Alunos("Pedro", 5.6);
        Alunos a2 = new Alunos("Ana", 9.6);
        Alunos a3 = new Alunos("Joyce", 3.6);
        Alunos a4 = new Alunos("Lucas", 7.6);
        Alunos a5 = new Alunos("Leticia", 8.6);
        Alunos a6 = new Alunos("Paulo", 4.6);
        Alunos a7 = new Alunos("Pablo", 10.0);

        List<Alunos> list = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);

        Predicate<Alunos> aprovado = a-> a.nota >= 7;
        Function<Alunos,Double> getNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a,b) -> a+b;

        list.stream()
                .filter(aprovado)
                .map(getNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);

    }
}
