
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char harf = sc.next().charAt(0);
        if((harf >= 'a' && harf <= 'z') || (harf>='A' && harf<='Z')){
            System.out.println("Alfabede");
        }
        else{
            System.out.println("Alfabede yok ");
        }




        sc.close();
    }
}
