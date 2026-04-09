import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        // Entrada de dados
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Processamento e saída (dobro)
        System.out.println("\nDobro dos números:");
        for (int i = 0; i < numeros.length; i++) {
            int dobro = numeros[i] * 2;
            System.out.println("Posição " + i + ": " + dobro);
        }

        scanner.close();
    }
}