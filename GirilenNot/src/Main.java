
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int not = sc.nextInt();
        if(not <= 100 && not >= 90){
            System.out.println("AA");
        } else if (not < 90 && not>=85) {
            System.out.println("BA");
        } else if (not < 85 && not >=80){
            System.out.println("BB");
        } else if (not < 80 && not >= 75) {
            System.out.println("CB");
        } else if (not < 75 && not >= 70) {
            System.out.println("CC");
        } else if (not < 70 && not >= 65) {
            System.out.println("DC");
        } else if (not < 65 && not >= 60) {
            System.out.println("DD");
        }else{
            System.out.println("Uygun değer girmediniz");
        }

        sc.close();
    }
}