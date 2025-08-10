import model.Personagem;
import model.impl.Guerreiro;
import model.impl.Mago;

import java.util.*;

public class ExemploColecoesRPG {

    public static void main(String[] args) {
        // Set para garantir personagens únicos
        Set<Personagem> personagens = new HashSet<>();
        personagens.add(new Mago("Gandalf", "Mago", "Alta"));
        personagens.add(new Guerreiro("Conan", "Guerreiro", "Alta"));
        personagens.add(new Mago("Merlin", "Mago", "Média"));
        personagens.add(new Mago("Gandalf", "Mago", "Alta")); // duplicado, será ignorado

        // Map para associar personagem ao nível de experiência
        Map<Personagem, Integer> experiencia = new HashMap<>();
        for (Personagem p : personagens) {
            experiencia.put(p, new Random().nextInt(100)); // valor aleatório de experiência
        }

        // Exibe os personagens e suas experiências
        for (Personagem p : experiencia.keySet()) {
            System.out.println(p.getNome() + " (" + p.getTipo() + ") tem experiência " + experiencia.get(p));
        }
    }
}
