
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ank_ist = 453;
        System.out.println("Saati yazınız : ");
        int saat = sc.nextInt();
        int hiz;
        hiz = ank_ist / saat;
        System.out.println("Varılan hız : " + hiz + "km/saat");
        sc.close();
    }
}