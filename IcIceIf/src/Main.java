
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk değeri gir");
        int first = sc.nextInt();
        System.out.println("İkinci değeri gir");
        int second = sc.nextInt();

        if(first > second){
            System.out.println("İlk değer daha büyük");
        }
        else if(second < first){
            System.out.println("İkinci değer daha büyük");
        }
        else{
            System.out.println("Birinci İle ikinci değer eşit");
        }


        sc.close();
    }
}