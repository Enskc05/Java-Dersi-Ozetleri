
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char secim = sc.next().charAt(0);

        switch (secim){
            case 'a':
                System.out.println("Klavye de a ' ya basıldı");
                break;
            case 'b':
                System.out.println("Klavye de b'ye basıldı");
                break;
            case 'c':
                System.out.println("klavyede c'ye basıldı");
                break;
            default:
                System.out.println("Klavye de a b ve c den farklı basıldı");
                break;
        }




        sc.close();
    }
}