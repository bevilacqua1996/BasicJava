package model.impl;

import model.Personagem;
import skills.HabilidadesMago;

public class Mago extends Personagem implements HabilidadesMago {
    public Mago(String nome, String tipo, String forca) {
        super(nome, tipo, forca);
    }

    @Override
    public void atacar() {
        System.out.println("Mago ataca com varinha de forca " + super.forca + ".");
    }

    @Override
    public void falar() {
        System.out.println("Mago " + super.nome + " está falando.");
    }

    @Override
    public void andar() {
        super.andar();
    }

    @Override
    public void chamas() {
        System.out.println("Mago usa habilidade de chamas com forca " + super.forca + ".");
    }

    @Override
    public void gelo() {
        System.out.println("Mago usa habilidade de gelo de forca " + super.forca + ".");
    }

    @Override
    public void cura() {
        System.out.println("Mago usa habilidade de cura.");
    }
}
