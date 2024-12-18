import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Gerando um número aleatório entre 1 e 50
        Random random = new Random();
        int numeroSorteado = random.nextInt(50) + 1; // Gera um número entre 1 e 50

        int palpite = 0;
        int tentativas = 0;

        // Loop até o usuário adivinhar o número
        while (palpite != numeroSorteado) {
            // Solicitar ao usuário que faça um palpite
            System.out.print("Digite um número entre 1 e 50: ");
            palpite = scanner.nextInt();
            tentativas++;

            // Verificar se o palpite está correto
            if (palpite == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
