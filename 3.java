import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite o valor de n
        System.out.print("Digite o valor de n (quantidade de números da sequência de Fibonacci): ");
        int n = scanner.nextInt();

        // Verificar se n é um valor válido
        if (n <= 0) {
            System.out.println("Por favor, insira um valor maior que 0.");
        } else {
            // Exibir os primeiros n números da sequência de Fibonacci
            System.out.println("Sequência de Fibonacci até " + n + " termos:");

            for (int i = 1; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        // Fechar o scanner
        scanner.close();
    }

    // Método que calcula o número Fibonacci na posição n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Caso base: Fibonacci(0) = 0, Fibonacci(1) = 1
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
