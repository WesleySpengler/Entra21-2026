import java.util.Scanner;

public class aula4 {
	

	public static void main(String[] args) {
		//atividade1();
		atividade2();
		
	
	}
		     

     static void atividade1() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        sc.close();
    }


	static void atividade2() {
		Scanner sc = new Scanner(System.in);

	    System.out.print("Digite o primeiro número: ");
	    int a = sc.nextInt();

	    System.out.print("Digite o segundo número: ");
	    int b = sc.nextInt();

	    if (a > b) {
	        System.out.println("Maior: " + a);
	    } else {
	        System.out.println("Maior: " + b);
	    }

	    sc.close();
    }
	
	
	
	
}