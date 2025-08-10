package model;

import java.util.Objects;

public abstract class Personagem {

    protected String nome;
    protected String tipo;
    protected String forca;

    protected Personagem(String nome, String tipo, String forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
    }

    public void falar() {
        System.out.println("Falando");
    }

    public void andar() {
        System.out.println("Andando");
    }

    public void atacar() {
        System.out.println("Atacando");
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getForca() {
        return forca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem personagem = (Personagem) o;
        return nome.equals(personagem.nome) &&
                tipo.equals(personagem.tipo) &&
                forca.equals(personagem.forca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tipo, forca);
    }
}
