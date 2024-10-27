
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char secim = sc.next().charAt(0);

        switch (secim){
            case 'a':
            case 'A':
                System.out.println("Kalvye de A ya basıldı");
                break;
            default:
                System.out.println("Klavye de A dışında basıldı");
                break;
        }




        sc.close();
    }
}