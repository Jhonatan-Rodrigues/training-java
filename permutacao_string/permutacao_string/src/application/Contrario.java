package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contrario {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_from_question = br.readLine();
		String text = "";
		
		for(int i = input_from_question.length() -1; i>=0; i--) {
			text = text + input_from_question.charAt(i);
		}
		if(text.matches(input_from_question))
		System.out.println(text);
		
	}

}
