import java.util.Scanner;

public class InverterNumero {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Chamar o método para inverter o número
        int numeroInvertido = inverterNumero(numero);

        // Exibir o número invertido
        System.out.println("Número invertido: " + numeroInvertido);

        // Fechar o scanner
        scanner.close();
    }

    // Método para inverter o número
    public static int inverterNumero(int numero) {
        int invertido = 0;

        // Enquanto o número for maior que 0
        while (numero != 0) {
            // Pega o último dígito e adiciona ao número invertido
            int digito = numero % 10;
            invertido = invertido * 10 + digito;

            // Remove o último dígito do número
            numero /= 10;
        }

        return invertido;
    }
}
