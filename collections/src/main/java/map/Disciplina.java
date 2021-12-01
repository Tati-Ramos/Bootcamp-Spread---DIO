package map;

//Crie uma classe Curso que possua os atributos: Disciplina, matricula

import java.util.Objects;

public class Disciplina implements Comparable<Disciplina> {
    private String nome;
    private Integer duracao;

    public Disciplina(String nome, Integer duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return nome.equals(that.nome) && duracao.equals(that.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, duracao);
    }

    @Override
    public int compareTo(Disciplina disciplina) {
        return this.getNome().compareToIgnoreCase(disciplina.getNome());
    }
}
