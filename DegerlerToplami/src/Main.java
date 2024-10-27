
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int toplam=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Başlangıç : ");
        int start = sc.nextInt();
        System.out.println("\nBitiş : ");
        int stop = sc.nextInt();

        for(int i=start;i<=stop;i++){
            toplam = i + toplam;
        }
        System.out.println("Toplam : " + toplam);

        sc.close();
    }
}