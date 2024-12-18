import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Solicitar o operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        // Solicitar o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        // Realizando a operação de acordo com o operador
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                // Verificando divisão por zero
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        // Exibindo o resultado da operação
        System.out.println("Resultado: " + resultado);

        // Fechar o scanner
        scanner.close();
    }
}
