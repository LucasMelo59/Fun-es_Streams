package outros_metodos;

import Aluno.Alunos;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {

        Alunos a1 = new Alunos("Pedro", 5.6);
        Alunos a2 = new Alunos("Ana", 9.6);
        Alunos a3 = new Alunos("Joyce", 3.6);
        Alunos a4 = new Alunos("Lucas", 7.6);
        Alunos a5 = new Alunos("Leticia", 8.6);
        Alunos a6 = new Alunos("Paulo", 4.6);
        Alunos a7 = new Alunos("Paulo", 10.0);

        List<Alunos> list = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
        System.out.println("distinct");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("skip e limit");
        list.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);


        System.out.println("takeWhile");
        list.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }


}
