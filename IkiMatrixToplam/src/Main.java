
public class Main {
    public static void main(String[] args) {
        int[][] c = new int[2][3];
        int[][] a = {
                {5,3,7},
                {0,1,2}
        };
        int[][] b = {
                {1,2,3},
                {4,5,6}
        };


        System.out.println("A matrix: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        };
        System.out.println("B matrix: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("\t" + b[i][j]);
            }
            System.out.println();
        };
        System.out.println("C matrix: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print("\t" + c[i][j]);
            }
            System.out.println();
        }



    }
}