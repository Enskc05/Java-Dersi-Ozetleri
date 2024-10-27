
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float yukseklik = sc.nextFloat();
        float en = sc.nextFloat();
        float boy = sc.nextFloat();
        float kup;

        kup = en*boy*yukseklik;
        System.out.println(kup+"M^3");
        sc.close();
    }
}