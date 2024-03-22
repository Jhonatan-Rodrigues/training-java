import java.util.Locale;
import java.util.Scanner;

public class Altura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i<n; i++){
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.println("nome: ");
            nome[i] = sc.next();
            System.out.println("idade: ");
            idade[i] = sc.nextInt();
            System.out.println("altura: ");
            altura[i] = sc.nextDouble();
        }

        double alturaMedia = 0.0;

        for(int i = 0; i<n; i++){
           alturaMedia = alturaMedia + altura[i];

        }
        double alturaMedFinal = alturaMedia/n;
        System.out.printf("\nAltura media = %.2f\n", alturaMedFinal);

        int menores = 0;
        for(int i = 0; i<n; i++){
            if (idade[i]< 16){
                menores++;
            }

        }

        double porcentagemMen = (double) menores / n * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMen);


        for(int i = 0; i<n; i++){
            if (idade[i]< 16){
                System.out.printf("%s\n", nome[i]);
            }

        }










        sc.close();


    }
}
