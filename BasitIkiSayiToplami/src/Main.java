
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int ilkSayi = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int ikinciSayi = sc.nextInt();

        System.out.println("toplamları: " + (ilkSayi+ikinciSayi));

        sc.close();
    }
}