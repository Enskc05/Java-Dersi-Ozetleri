
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int yuzlerBas = sc.nextInt();
        int onlarBas = sc.nextInt();
        int birlerBas = sc.nextInt();
        System.out.println("Yüzler basamağı: " + (yuzlerBas*100) + "\nOnlar basamağı: " + (onlarBas*10) + "\nBirler basamağı: " + (birlerBas) + "\nToplam sayı: " + (yuzlerBas*100 + onlarBas*10 + birlerBas));
        sc.close();
    }
}