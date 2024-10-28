

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Armstrong sayısı kontrol merkezine hoşgeldiniz.");
        System.out.println("Lütfen kontrol edilecek değeri giriniz");
        int deger = sc.nextInt();

        int orjinalDeger = deger;
        int sayininSonBasamak = String.valueOf(deger).length();
        int sum = 0;

        while(deger > 0){
            int sonBasamak = deger % 10;
            sum += Math.pow(sonBasamak , sayininSonBasamak);
            deger /= 10;
        }
        if(sum == orjinalDeger){
            System.out.println(orjinalDeger+ " Bir armstrong sayıdır.");
        }
        else{
            System.out.println(orjinalDeger + " Sayısı armstrong sayı değildir.");
        }



        sc.close();
    }
}