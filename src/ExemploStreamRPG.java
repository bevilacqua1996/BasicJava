import model.Personagem;
import model.impl.Guerreiro;
import model.impl.Mago;

import java.util.Arrays;
import java.util.List;

public class ExemploStreamRPG {

    public static void main(String[] args) {
        List<Personagem> personagens = Arrays.asList(
                new Guerreiro("Conan", "Guerreiro", "Alta"),
                new Mago("Gandalf", "Mago", "Média"),
                new Mago("Merlin", "Mago", "Baixa")
        );

        personagens.stream()
                .filter(Mago.class::isInstance)
                .map(ExemploStreamRPG::formataDescricao)
                .forEach(System.out::println);


    }

    public static String formataDescricao(Personagem p) {
        return p.getNome() + " é um " + p.getTipo() + " com força " + p.getForca();
    }
}
