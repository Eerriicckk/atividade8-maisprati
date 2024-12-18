import java.util.Arrays;
import java.util.Scanner;

public class Anagramas {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário as duas palavras
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        // Verificar se as palavras são anagramas
        if (saoAnagramas(palavra1, palavra2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }

        // Fechar o scanner
        scanner.close();
    }

    // Método para verificar se duas palavras são anagramas
    public static boolean saoAnagramas(String palavra1, String palavra2) {
        // Se as palavras tiverem comprimentos diferentes, não podem ser anagramas
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        // Convertendo as palavras para arrays de caracteres
        char[] array1 = palavra1.toLowerCase().toCharArray();
        char[] array2 = palavra2.toLowerCase().toCharArray();

        // Ordenando os arrays de caracteres
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Verificando se os arrays ordenados são iguais
        return Arrays.equals(array1, array2);
    }
}
