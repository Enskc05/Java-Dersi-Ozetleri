

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayı: ");
        int ilksayi = sc.nextInt();
        System.out.println("İkinci sayı: ");
        int ikincisayi = sc.nextInt();
        System.out.println("1-Topla, 2-Çıkart, 3-Çarp, 4-Böl, 5-Çıkış");
        int tepki = sc.nextInt();
        boolean t = true;
        while(t){
            if(tepki == 1){
                System.out.println("Toplamları: " + (ilksayi+ikincisayi));
                break;
            }
            else if(tepki == 2){
                System.out.println("Farkları: " + (ilksayi-ikincisayi));
                break;
            }
            else if(tepki == 3){
                System.out.println("Çarpımları: " + (ilksayi*ikincisayi));
                break;
            }
            else if(tepki == 4){
                System.out.println("Bölümleri: " + (ilksayi/ikincisayi));
                break;
            }else if(tepki == 5){
                t = false;
                System.out.println("Çıkış Yapılıyor.");
                break;

            }
        }
        sc.close();
    }
}