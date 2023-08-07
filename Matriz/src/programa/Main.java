package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		;
		System.out.print("Matriz de quantos lados? ");
		int x = sc.nextInt();

		int[][] vetor = new int[x][x];

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				System.out.printf("Digite a linha %d, coluna %d: ", (i + 1), (j + 1), "\n");
				vetor[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal principal");
		int contador = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				if (vetor[i][j] < 0) {
					contador++;
				}
				if (i == j) {
					System.out.println(vetor[i][j]);
				}

			}

		}
		System.out.println("\nQuantidade de números negativos: ");

		System.out.println(contador);
		sc.close();
	}

}
