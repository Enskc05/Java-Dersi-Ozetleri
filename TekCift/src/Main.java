
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tek mi Çift mi ");
        int sayi = sc.nextInt();
        if(sayi % 2 == 0){
            System.out.println("Sayı çift sayı");
        }
        else{
            System.out.println("Sayı tek sayı");
        }
        sc.close();
    }
}