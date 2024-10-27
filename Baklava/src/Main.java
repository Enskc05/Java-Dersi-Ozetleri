import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Baklava kaç katlı olsun?");
        int max = sc.nextInt();
        int bosluk = max - 1;

        // Üst kısım (baklava diliminin üstü)
        for (int i = 0; i < max; i++) {
            for (int k = 0; k < bosluk; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            bosluk--;
        }

        // Alt kısım (baklava diliminin altı)
        for (int i = 0; i < max; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int p = 2 * (max - 2) - 2 * i - 1; p > 0; p--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

