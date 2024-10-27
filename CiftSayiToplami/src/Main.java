
public class Main{
    public static void main(String[] args){
        int i,toplam = 0;
        for(i=1;i<=50;i++){
            if(i % 2 == 0 ) {
                toplam = toplam + i;
            }
        }System.out.println(toplam);

    }
}