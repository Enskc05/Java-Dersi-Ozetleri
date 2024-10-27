
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int i,toplam=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hesaplanacak değeri girin.");
        int sayi = sc.nextInt();
        for(i=sayi;i>0;i--){
            toplam = toplam * i;
        }
        System.out.println(toplam);



    sc.close();
    }
}