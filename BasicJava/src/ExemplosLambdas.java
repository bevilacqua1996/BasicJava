import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExemplosLambdas {
    public static void main(String[] args) {
        // Predicate: verifica se o nome tem mais de 5 letras
        Predicate<String> nomeLongo = nome -> nome.length() > 5;
        System.out.println(nomeLongo.test("Gandalf")); // true

        // Function: converte String para inteiro (tamanho)
        Function<String, Integer> tamanho = s -> s.length();
        System.out.println(tamanho.apply("Mago")); // 4

        // Consumer: imprime o nome em maiúsculas
        Consumer<String> imprimirMaiusculo = s -> System.out.println(s.toUpperCase());
        imprimirMaiusculo.accept("guerreiro");

        // Supplier: fornece um valor aleatório
        Supplier<Double> aleatorio = () -> Math.random();
        System.out.println(aleatorio.get());
    }
}
