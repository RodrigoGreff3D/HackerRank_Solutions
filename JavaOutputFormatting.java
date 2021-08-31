package hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {
	/*
	 * 
	 * Neste exercício usei especificadores de formato (%)
	 * 
	 * %-15s é o posicionamento da String conforme pedido no exercício “he first
	 * column contains the String and is left justified using exactly 15
	 * characters.”
	 * 
	 * %03d aqui represento um inteiro que tera a saida com 3 digitos se completando
	 * com 0 caso a entrada seja menor
	 * 
	 * %n usei apenas para pular a linha
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("================================");

		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-15s%03d%n", s1, x);
		}
		System.out.println("================================");
		sc.close();
	}
}
