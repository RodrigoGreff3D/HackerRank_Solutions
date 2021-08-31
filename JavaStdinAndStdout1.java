package hackerrank;

import java.util.Scanner;

public class JavaStdinAndStdout1 {

	/*
	 * Exercício simples de entrada de dados usando a classe Scanner.
	 * 
	 * scan.nextInt() --- serve pra ler um inteiro.
	 * 
	 * Após imprimo no console os inteiros.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
