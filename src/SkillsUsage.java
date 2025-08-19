import model.impl.Mago;
import skills.HabilidadesGuerreiro;
import skills.HabilidadesMago;

public class SkillsUsage {

    public static void main(String[] args) {
        // Exemplo de uso de habilidades de um Guerreiro
        HabilidadesGuerreiro habilidadesGuerreiro = (s, s2) -> System.out.println(s + " " + s2 + " " +"Guerreiro usa explosão!");
        habilidadesGuerreiro.explosao("TESTE", "Guerreiro");

        // Exemplo de uso de habilidades de um Mago

        Mago mago = new Mago( "Gandalf", "Mago", "Média");
        mago.chamas();
        mago.gelo();
        mago.cura();
    }

}
