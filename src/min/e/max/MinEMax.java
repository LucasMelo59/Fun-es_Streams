package min.e.max;

import Aluno.Alunos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinEMax {
    public static void main(String[] args) {
        Alunos a1 = new Alunos("Pedro", 5.6);
        Alunos a2 = new Alunos("Ana", 9.6);
        Alunos a3 = new Alunos("Joyce", 3.6);
        Alunos a4 = new Alunos("Lucas", 7.6);
        Alunos a5 = new Alunos("Leticia", 8.6);
        Alunos a6 = new Alunos("Paulo", 4.6);
        Alunos a7 = new Alunos("Pablo", 10.0);

        List<Alunos> list = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);

        // no comparator quando é retornado 1 significa que o primeiro objeto é maior que o segundo, e -1 quando for menor, e se for 0 os objetos serão iguais.

        Comparator<Alunos> melhorNota = (aluno1,aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota< aluno2.nota) return  -1;
            return 0;
        };

        System.out.println(list.stream().max(melhorNota).get());
        System.out.println(list.stream().min(melhorNota).get());

    }
}
