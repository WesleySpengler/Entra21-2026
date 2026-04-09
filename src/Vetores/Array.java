package Vetores;

import java.util.Scanner;

public class Array {
	 public static void main(String[] args) {
		 
		// exercicio1();
		 //exercicio2();
		 //exercicio3();
		 //exercicio4();
	exercicio5();
		// exercicio6();
	 }	 
	 static void exercicio1() {
	        Scanner scanner = new Scanner(System.in);
	       
	        int [] numeros = new int [5];
	        
	   for (int i = 0; i < numeros.length; i++) {
		   System.out.print("Digite um numero para a posição " + i + ": ");
		   numeros[i] = scanner.nextInt();	  
		   }
	        
	   System.out.println("Dobro dos números:");
	   for (int i = 0; i < numeros.length; i++) {
		   int dobro = numeros[i] * 2;
		   	System.out.println("Posição " + i + ": " + dobro);
	   }
	   scanner.close();
}
	 static void  exercicio2() {
		 
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
	 static void exercicio3() {
		 int[] numeros = new int[10];

	        // Preenchendo o vetor com valores de 1 a 10
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = i + 1;
	        }

	        // Mostrando o vetor invertido
	        System.out.println("Vetor invertido:");
	        for (int i = numeros.length - 1; i >= 0; i--) {
	            System.out.print(numeros[i] + " ");
	        }		 
	 }
	 static void exercicio4() {
		 Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[15];
	        int maior = Integer.MIN_VALUE; // começa com o menor valor possível

	        // Leitura dos 15 números
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Digite o número da posição " + i + ": ");
	            numeros[i] = scanner.nextInt();

	            // Atualiza o maior valor
	            if (numeros[i] > maior) {
	                maior = numeros[i];
	            }
	        }

	        // Exibe o maior valor
	        System.out.println("\nO maior valor é: " + maior);

	        // Verifica em quais posições o maior valor aparece
	        System.out.print("Posições em que o maior valor aparece: ");
	        for (int i = 0; i < numeros.length; i++) {
	            if (numeros[i] == maior) {
	                System.out.print(i + " ");
	            }
	        }

	        scanner.close();
	 }
	 static void exercicio5() {
		    Scanner scanner = new Scanner(System.in);

		    int[] numeros = new int[8];

		    // Leitura dos 8 números
		    for (int i = 0; i < numeros.length; i++) {
		        System.out.print("Digite o número da posição " + i + ": ");
		        numeros[i] = scanner.nextInt();
		    }

		    // Ordenação em ordem crescente usando Bubble Sort
		    for (int i = 0; i < numeros.length - 1; i++) {
		        for (int j = 0; j < numeros.length - 1 - i; j++) {
		            if (numeros[j] > numeros[j + 1]) {
		                // Troca os números
		                int temp = numeros[j];
		                numeros[j] = numeros[j + 1];
		                numeros[j + 1] = temp;
		            }
		        }
		    }

		    // Exibe o vetor ordenado
		    System.out.println("\nVetor em ordem crescente:");
		    for (int i = 0; i < numeros.length; i++) {
		        System.out.print(numeros[i] + " ");
		    }

		  
		    scanner.close();
	 } 
	 static void exercicio6() {
		    Scanner scanner = new Scanner(System.in);

		    int[] numeros = new int[10];
		    int soma = 0;

		    // Leitura dos 10 números
		    for (int i = 0; i < numeros.length; i++) {
		        System.out.print("Digite o número da posição " + i + ": ");
		        numeros[i] = scanner.nextInt();
		        soma += numeros[i]; // soma para calcular a média
		    }

		    // Calcula a média
		    double media = (double) soma / numeros.length;
		    System.out.println("\nMédia dos números: " + media);

		    // Mostra apenas os números acima da média
		    System.out.println("Números acima da média:");
		    for (int i = 0; i < numeros.length; i++) {
		        if (numeros[i] > media) {
		            System.out.print(numeros[i] + " ");
		        }
		    }

		   
		    scanner.close();
		}
}

	 


