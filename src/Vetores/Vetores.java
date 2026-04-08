package Vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		

	       
		Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[5];

	        // Preenchendo o array
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Digite um número: ");
	            numeros[i] = scanner.nextInt();
	        }

	        System.out.println("");

	        // Percorrendo e mostrando o dobro
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println(i + " -> " + (numeros[i] * 2));
	        }

	        scanner.close();
	}


	}


