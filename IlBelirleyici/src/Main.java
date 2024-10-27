
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int deger = sc.nextInt();
        switch (deger){
            case 34:
                System.out.println("İstabul");
                break;
            case 6:
                System.out.println("Ankara");
                break;
            case 45:
                System.out.println("Manisa");
                break;
            default:
                System.out.println("Başka bir il");
                break;
        }




        sc.close();
    }
}