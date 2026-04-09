package Vetores;

import java.util.Scanner;

public class Array {
	 public static void main(String[] args) {
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
}




