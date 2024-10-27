
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipini seçiniz: \nA=Ticari araba.\nB=Binek araba.\nC=Spor araba.");
        int a=50,b=60,c=70;
        char tip = sc.next().charAt(0);
        System.out.println("Kaç saat ? ");
        int time = sc.nextInt();
        switch (tip){
            case 'a':
            case 'A':
                System.out.println("Fiyat: "+ (a*time));
                break;
            case 'b':
            case 'B':
                System.out.println("Fiyat: "+ (b*time));
                break;
            case 'c':
            case 'C':
                System.out.println("Fiyat: "+(c*time));
                break;
        }





        sc.close();
    }
}