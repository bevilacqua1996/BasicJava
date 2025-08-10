package model.impl;

import model.Personagem;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, String tipo, String forca) {
        super(nome, tipo, forca);
    }

    @Override
    public void falar() {
        System.out.println("Guerreiro " + super.nome + " está falando.");
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro ataca com espada de forca " + super.forca + ".");
    }
}
