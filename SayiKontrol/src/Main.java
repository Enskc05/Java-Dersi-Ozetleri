
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x != y) {
            if(x>y){
                System.out.println(x-y);
            }
            else{
                System.out.println(y-x);
            }
        }
        else{
            System.out.println(0);
        }




        sc.close();
    }
}