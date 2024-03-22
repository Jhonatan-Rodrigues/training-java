import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.println("negative numbers: "+vect[i]);
            }

        }


        sc.close();
    }
}