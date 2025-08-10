import model.Personagem;
import model.impl.Guerreiro;
import model.impl.Mago;

public class RPGClasses {
    public static void main(String[] args) {
        // Criando um personagem do tipo Guerreiro
        Personagem guerreiro = new Guerreiro("Conan", "Guerreiro", "Alta");
        guerreiro.falar();
        guerreiro.andar();
        guerreiro.atacar();

        // Criando um personagem do tipo Mago
        Personagem mago = new Mago("Gandalf", "Mago", "Média");
        mago.falar();
        mago.andar();
        mago.atacar();
    }
}
