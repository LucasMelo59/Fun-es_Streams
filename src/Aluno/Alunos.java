package Aluno;

import java.util.Objects;

public class Alunos {
    public String nome;
    public double nota;

    public Alunos(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString () {
        return nome + " tem nota " + nota;
    }


}
