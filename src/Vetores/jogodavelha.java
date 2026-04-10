package Vetores;

import java.util.Scanner;

public class jogodavelha {



		    static char[] tabuleiro = new char[9];
		    static char jogadorAtual = 'X';

		    public static void main(String[] args) {
		        inicializarTabuleiro();
		        jogar();
		    }

		    public static void inicializarTabuleiro() {
		        for (int i = 0; i < 9; i++) {
		            tabuleiro[i] = ' ';
		        }
		    }

		    public static void mostrarTabuleiro() {
		        System.out.println();
		        System.out.println(" " + tabuleiro[0] + " | " + tabuleiro[1] + " | " + tabuleiro[2]);
		        System.out.println("---+---+---");
		        System.out.println(" " + tabuleiro[3] + " | " + tabuleiro[4] + " | " + tabuleiro[5]);
		        System.out.println("---+---+---");
		        System.out.println(" " + tabuleiro[6] + " | " + tabuleiro[7] + " | " + tabuleiro[8]);
		        System.out.println();
		    }

		    public static boolean jogadaValida(int pos) {
		        return pos >= 0 && pos < 9 && tabuleiro[pos] == ' ';
		    }

		    public static boolean verificarVitoria() {
		        int[][] combinacoes = {
		            {0,1,2}, {3,4,5}, {6,7,8}, // linhas
		            {0,3,6}, {1,4,7}, {2,5,8}, // colunas
		            {0,4,8}, {2,4,6}           // diagonais
		        };

		        for (int[] c : combinacoes) {
		            if (tabuleiro[c[0]] == jogadorAtual &&
		                tabuleiro[c[1]] == jogadorAtual &&
		                tabuleiro[c[2]] == jogadorAtual) {
		                return true;
		            }
		        }
		        return false;
		    }

		    public static boolean verificarEmpate() {
		        for (char c : tabuleiro) {
		            if (c == ' ') return false;
		        }
		        return true;
		    }

		    public static void trocarJogador() {
		        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
		    }

		    public static void jogar() {
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            mostrarTabuleiro();
		            System.out.print("Jogador " + jogadorAtual + ", escolha uma posição (1-9): ");

		            int pos;
		            try {
		                pos = sc.nextInt() - 1;
		            } catch (Exception e) {
		                System.out.println("Entrada inválida!");
		                sc.next(); // limpa entrada
		                continue;
		            }

		            if (!jogadaValida(pos)) {
		                System.out.println("Posição inválida! Tente novamente.");
		                continue;
		            }

		            tabuleiro[pos] = jogadorAtual;

		            if (verificarVitoria()) {
		                mostrarTabuleiro();
		                System.out.println("🎉 Jogador " + jogadorAtual + " venceu!");
		                break;
		            }

		            if (verificarEmpate()) {
		                mostrarTabuleiro();
		                System.out.println("🤝 Empate!");
		                break;
		            }

		            trocarJogador();
		        }

		        sc.close();
		    }
		
		
		
		

	}

/*Desenvolva um programa em Java que implemente o jogo da velha (tic-tac-toe) para dois jogadores humanos.

O programa deve:
- Utilizar um tabuleiro 3x3 representado por uma estrutura de dados (array ou matriz).
- Permitir que dois jogadores alternem entre os símbolos 'X' e 'O'.
- Solicitar ao usuário a posição da jogada (de 1 a 9).
- Validar as entradas, impedindo jogadas em posições inválidas ou já ocupadas.
- Exibir o tabuleiro atualizado após cada jogada.
- Verificar e informar quando houver vitória ou empate.
- Encerrar o jogo ao final de uma partida.

Requisitos de implementação:
- O código deve ser organizado em métodos (funções), evitando duplicação de código.
- Criar métodos para: exibir o tabuleiro, validar jogadas, verificar vitória, verificar empate e alternar jogadores.
- Não utilizar inteligência artificial (o jogo deve ser apenas entre dois jogadores humanos).
*/