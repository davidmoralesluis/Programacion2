package Pruebas.Array;

import java.util.Objects;

public class Alumnado {

    private String nome;
    private int nota;

    public Alumnado(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumnado)) return false;
        Alumnado alumnado = (Alumnado) o;
        return getNota() == alumnado.getNota() && Objects.equals(getNome(), alumnado.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNota());
    }


}
