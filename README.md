# Exemplo de RPG em Java

Este projeto demonstra conceitos fundamentais de Java utilizando uma temática de RPG, com personagens, habilidades e exemplos de uso de coleções, lambdas e streams.

## Estrutura dos Exemplos

### `RPGClasses.java`
Demonstra a criação e uso básico de herança e polimorfismo em Java. Cria personagens do tipo `Guerreiro` e `Mago`, mostrando como cada um implementa seus próprios métodos.

### `ExemploColecoesRPG.java`
Mostra o uso de coleções (`Set` e `Map`) para garantir unicidade de personagens e associar experiência a cada um. Explica a importância de sobrescrever `equals` e `hashCode` para funcionamento correto das coleções.

### `ExemploStreamRPG.java`
Exemplo de uso de Streams para filtrar e mapear personagens, mostrando como trabalhar com processamento funcional de listas em Java.

### `SkillsUsage.java`
Demonstra o uso de interfaces funcionais personalizadas (`HabilidadesGuerreiro` e `HabilidadesMago`) e como implementar lambdas para representar habilidades dos personagens.

### `ExemplosLambdas.java`
Apresenta exemplos práticos das principais interfaces funcionais da API Java (`Predicate`, `Function`, `Consumer`, `Supplier`), mostrando como criar e utilizar lambdas para tarefas comuns.

---

## Como executar

1. Compile o projeto:

````bash
javac src/*.java src/model/*.java src/model/impl/*.java src/skills/*.java
````
2. Execute a classe desejada:

````bash
java -cp src NomeDaClasse
````

3. Para limpar as classes compiladas, execute:

````bash
find src -name "*.class" -delete
````
---

## Sobre

Projeto didático para estudo de Java, coleções, lambdas e programação orientada a objetos.