package hackerrank;

import java.util.Scanner;

public class JavaIfElse {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * 
		 * if (N % 2 > 0) -- aqui eu faço a lógica de se qualquer número que for ímpar
		 * imprimir Weird.
		 * 
		 * Qualquer numero que for dividido por 2 sobrar algum numero maior que zero.
		 * 
		 * O restante das validações são simples, seguindo as condições do exercício
		 */

		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (N % 2 > 0) {
			System.out.println("Weird");
		} else {
			if (N >= 2 && N <= 5) {
				System.out.println("Not Weird");
			} else if (N > 6 && N <= 20) {
				System.out.println("Weird");
			} else if (N > 20) {
				System.out.println("Not Weird");
			}
		}

		scanner.close();
	}
}
