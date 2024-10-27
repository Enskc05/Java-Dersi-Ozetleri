
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] dizi1 = new int[10];
        int secim;

        for(int i=0;i<10;i++){
            secim = sc.nextInt();
            System.out.println(i + ".sayıyı giriniz ");
            dizi1[i] = secim;
            if(secim == 0){
                break;
            }
        }
        for(int j=0;j<10;j++){
            System.out.print(dizi1[j]);
        }
        sc.close();
    }
}