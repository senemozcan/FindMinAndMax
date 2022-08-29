import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        int n = inp.nextInt();
        int as = 0;
        int max = 0, min = 0;

        for (int y = 1; y <= n; y++) {

            System.out.print(y + ". Sayıyı giriniz : ");
            int number = inp.nextInt();

            if (y == 1) {
                max = number;
                min = number;

            }


            if (number > max) {
                max = number;

            }
            if (number < min) {
                min = number;

            }

        }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);


    }
}