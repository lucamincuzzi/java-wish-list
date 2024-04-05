package org.experis.learning;

import java.util.Objects;

public class Regalo implements Comparable<Regalo> {
    // Attributi
    private String nome;

    // Costruttori
    public Regalo(String nome) {
        this.nome = nome;
    }

    // Metodi
        // Getter e Setter
    public String getNome() {
        return nome;
    }

        // Override di metodi Object
    @Override
    public String toString() {
        return "regalo: {" +
                "nome = '" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Regalo regalo = (Regalo) o;
        return Objects.equals(nome, regalo.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public int compareTo(Regalo r) {
        return getNome().compareTo(r.getNome());
    }
}
