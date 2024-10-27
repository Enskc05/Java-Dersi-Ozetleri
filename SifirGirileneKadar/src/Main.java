
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sayi;
        int toplam=0;
        do {
            System.out.println("Değer giriniz");
            sayi = sc.nextInt();

            toplam = sayi + toplam;
        }while(sayi!=0);
        System.out.println(toplam);
        



        sc.close();
    }
}