import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para digitar uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Converter a palavra para minúsculas para ignorar diferenças de maiúsculas e minúsculas
        palavra = palavra.toLowerCase();

        // Verificar se a palavra é um palíndromo
        if (ehPalindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        // Fechar o scanner
        scanner.close();
    }

    // Método que verifica se a palavra é um palíndromo
    public static boolean ehPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;

        // Verificar se o primeiro e o último caractere são iguais e continuar comparando
        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false; // Se algum caractere não for igual, não é palíndromo
            }
            inicio++;
            fim--;
        }
        return true; // Se todos os caracteres coincidirem, é um palíndromo
    }
}
