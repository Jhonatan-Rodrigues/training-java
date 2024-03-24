import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int posiMaior;
        double maiorValor;

        double valores[] = new double[n];

        for(int i = 0; i<n;i++){
            System.out.println("Digite um numero: ");
           valores[i] = sc.nextDouble();
        }

       maiorValor = valores[0];
        posiMaior = 0;

        for(int i = 0; i<n;i++) {
            if (valores[i]>maiorValor){
                maiorValor = valores[i];
                posiMaior = i;
            }

        }

        System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posiMaior);

        }
}
