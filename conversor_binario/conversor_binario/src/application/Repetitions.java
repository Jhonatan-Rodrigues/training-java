package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_from_question = br.readLine();
		int numero = Integer.parseInt(input_from_question);
		converteBinario(numero);
	}

	private static void converteBinario(int n) {
		if(n>0) {
			converteBinario(n / 2);
			System.out.print(n % 2);

		}
	
	}

}
