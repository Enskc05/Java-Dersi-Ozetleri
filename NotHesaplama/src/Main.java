

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ogrNot = new int[3][3];
        int i,j;

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println((i+1) + ". Öğrenci" + (j+1) + ". Notunu giriniz: " );
                ogrNot[i][j] = sc.nextInt();

            }
        }

        for(i = 0; i < 3; i++){
            int ort = (ogrNot[0][i] + ogrNot[1][i] + ogrNot[2][i])/3;
            System.out.print("\n"+(i+1) + ". sınav ortalaması : " + ort);
        }





        sc.close();
    }
}