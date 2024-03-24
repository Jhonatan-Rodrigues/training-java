import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double vect[] = new double[n];

        for(int i = 0; i<n; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double valores = 0.0;
        for(int i = 0; i<n; i++){
          valores = valores + vect[i];
        }
        double media = valores/n;

        System.out.printf("media dos elementos = %.3f\n", media);

        System.out.println("Elementos abaixo da media");
        for(int i = 0; i<n; i++) {
            if (vect[i]< media){
                System.out.println(vect[i]);
            }

        }





        sc.close();
    }
}
