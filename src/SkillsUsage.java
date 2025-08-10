import model.impl.Mago;
import skills.HabilidadesGuerreiro;
import skills.HabilidadesMago;

public class SkillsUsage {

    public static void main(String[] args) {
        // Exemplo de uso de habilidades de um Guerreiro
        HabilidadesGuerreiro habilidadesGuerreiro = () -> System.out.println("Guerreiro usa explosão!");
        habilidadesGuerreiro.explosao();

        // Exemplo de uso de habilidades de um Mago

        Mago mago = new Mago( "Gandalf", "Mago", "Média");
        mago.chamas();
        mago.gelo();
        mago.cura();
    }

}
