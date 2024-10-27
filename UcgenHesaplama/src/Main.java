
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c ){
            System.out.println("Eşkenar üçgen");
        } else if (a == b || b == c) {
            System.out.println("İkizkenar üçgen");
        }else {
            System.out.println("Çeşitkenar üçgen");
        }
        sc.close();
    }
}