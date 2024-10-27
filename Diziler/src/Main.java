

public class Main {
    public static void main(String[] args){
        int[] numbers = {20, 5, 15, 30, 10};
        int max = numbers[0];
        int min = numbers[0];

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Max:"+max);
        System.out.print("Min:"+min);
    }
}