package hackerrank;

import java.util.Scanner;

public class JavaIfElse {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * 
		 * if (N % 2 > 0) -- aqui eu fa�o a l�gica de se qualquer n�mero que for �mpar
		 * imprimir Weird.
		 * 
		 * Qualquer numero que for dividido por 2 sobrar algum numero maior que zero.
		 * 
		 * O restante das valida��es s�o simples, seguindo as condi��es do exerc�cio
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
