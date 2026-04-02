import java.util.Scanner;

public class aula4 {
	

	public static void main(String[] args) {
		//atividade1();
		//atividade2();
		//atividade3();		
		//atividade4();	
		//atividade5();
	    //atividade6();
	    //atividade7();
	    //atividade8();
	    //atividade9();
		//atividade10();
		//atividade11();
		//atividade12();
		//atividade13();
		//atividade14();
	    //atividade15();
		//atividade16();
		//atividade17();   
		//atividade18();
		//atividade19();
		atividade20();
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
	
	static void atividade3() {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
		
	}
	static void atividade4() {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite a nota do aluno (0 a 10): ");
	        double nota = sc.nextDouble();

	        if (nota >= 6) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Reprovado");
	        }
	
	}
	static void atividade5() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
		
	}
	static void atividade6(){
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int a = sc.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int b = sc.nextInt();

	        System.out.print("Digite o terceiro número: ");
	        int c = sc.nextInt();

	        int maior = a;
	        if (b > maior) {
	            maior = b;
	        }
	        if (c > maior) {
	            maior = c;
	        }

	        System.out.println("O maior número é: " + maior);
		
	}
	static void atividade7(){
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 10): ");
        double nota = sc.nextDouble();

        if (nota >= 0 && nota <= 4) {
            System.out.println("Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Regular");
        } else if (nota <= 8) {
            System.out.println("Bom");
        } else if (nota <= 10) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota inválida");
        }
		
	}
	static void atividade8(){
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double b = sc.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os lados formam um triângulo válido");
        } else {
            System.out.println("Não formam um triângulo válido");
        }
		
	}
	static void atividade9(){
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double b = sc.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não formam um triângulo válido");
        }
		
	}
	static void atividade10(){
		
		Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite o usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
	}
	static void atividade11(){
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }
		
	}
	static void atividade12() {
	 
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado;

        switch(op) {
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
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                sc.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }	
	static void atividade13() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000) {
            imposto = 0;
        } else if (salario <= 5000) {
            imposto = salario * 0.1; // 10%
        } else {
            imposto = salario * 0.2; // 20%
        }

        System.out.println("Imposto a pagar: R$ " + imposto);
       
		
	}
	static void atividade14() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valor = sc.nextDouble();
        double desconto;

        if (valor <= 100) {
            desconto = 0;
        } else if (valor <= 500) {
            desconto = valor * 0.1;
        } else {
            desconto = valor * 0.2;
        }

        double valorFinal = valor - desconto;
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
		
	}
	static void atividade15() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else if (idade >= 60) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade inválida");
        }
		
	}
	static void atividade16() {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        double n1 = sc.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double n2 = sc.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double n3 = sc.nextDouble();

	        double media = (n1 + n2 + n3) / 3;
	        System.out.println("Média: " + media);

	        if (media >= 7) {
	            System.out.println("Aprovado");
	        } else if (media >= 5) {
	            System.out.println("Recuperação");
	        } else {
	            System.out.println("Reprovado");
	        }
		
	} 
	static void atividade17() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite o valor da parcela: R$ ");
        double parcela = sc.nextDouble();

        // regra: parcela não pode ultrapassar 30% do salário
        if (parcela <= salario * 0.3) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo negado");
        }	
		
	}
	static void atividade18() {
		  Scanner sc = new Scanner(System.in);
	        int numeroSecreto = 42; // pode ser randomizado

	        System.out.print("Tente adivinhar o número: ");
	        int palpite = sc.nextInt();

	        if (palpite == numeroSecreto) {
	            System.out.println("Parabéns! Você acertou.");
	        } else if (palpite < numeroSecreto) {
	            System.out.println("O número secreto é maior.");
	        } else {
	            System.out.println("O número secreto é menor.");
	        }
		
	}
	static void atividade19() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Baixo peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

		
	}
	static void atividade20() {
		
		Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        boolean acessoPermitido = false;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a senha (tentativa " + i + " de 3): ");
            String senha = sc.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido");
                acessoPermitido = true;
                break;
            } else {
                System.out.println("Senha incorreta");
            }
        }

        if (!acessoPermitido) {
            System.out.println("Acesso bloqueado");
        }    
	}
	
}