import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadePrimeiroHomem = obterIdade(scanner, "do", "homem", "primeiro");
        int idadeSegundoHomem = obterIdade(scanner, "do", "homem", "segundo");
        int idadePrimeiraMulher = obterIdade(scanner, "da", "mulher", "primeira");
        int idadeSegundaMulher = obterIdade(scanner, "da", "mulher", "segunda");

        int homemMaisVelho = Math.max(idadePrimeiroHomem, idadeSegundoHomem);
        int homemMaisNovo = Math.min(idadePrimeiroHomem, idadeSegundoHomem);
        int mulherMaisVelha = Math.max(idadePrimeiraMulher, idadeSegundaMulher);
        int mulherMaisNova = Math.min(idadePrimeiraMulher, idadeSegundaMulher);

        int calcularSomaIdades = homemMaisVelho + mulherMaisNova;
        int calcularProdutoIdades = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + calcularSomaIdades);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + calcularProdutoIdades);

        scanner.close();
    }

    static int obterIdade(Scanner scanner, String preposicao, String genero, String ordem) {
        while (true) {
            System.out.print("Informe a idade " + preposicao + " " + ordem + " " + genero + ": ");
            int idade = scanner.nextInt();

            if (idade >= 0) {
                System.out.println("A idade que você informou é: " + idade);
                return idade;
            }

            System.out.println("A idade não pode ser negativa. Escreva uma idade válida.");
        }
    }
}
