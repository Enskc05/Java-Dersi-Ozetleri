
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double oran = 1.609344;
        System.out.println("Hangisi (Mil : M/m veya Kilometre : K/k)");
        char secim = sc.next().charAt(0);
        if(secim == 'm' || secim == 'M'){
            System.out.println("Kaç mil yol aldınız ?");
            double mil = sc.nextDouble();
            System.out.println(String.format("%.5f Km yol aldınız" , mil / oran));
        } else if (secim == 'k' || secim == 'K') {
            System.out.println("Kaç km yol aldınız");
            double km = sc.nextDouble();
            System.out.println(String.format(" %.5f Mil yol aldınız" , km * oran)  );
        }


        sc.close();
    }
}
