package Vetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Entrada de dados
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("");

        // Verificando pares e ímpares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " -> PAR");
            } else {
                System.out.println(numeros[i] + " -> ÍMPAR");
            }
        }

        scanner.close();
	}

}
