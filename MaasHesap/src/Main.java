
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Çalışma saatinizi giriniz: ");
        float calisma_saat = sc.nextFloat();
        System.out.println("Saatlik ücretinizi giriniz: ");
        float ucret = sc.nextFloat();
        float maas;
        maas = calisma_saat * ucret;

        System.out.println("Maaşınız: " + maas*21);


        sc.close();
    }
}