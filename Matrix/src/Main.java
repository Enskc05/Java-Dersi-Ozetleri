

public class Main{
    public static void main(String[] args){
        int i, j;
        int[][] x = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print("\t"+x[i][j]);
            }
            System.out.print("\n");
        }


    }
}