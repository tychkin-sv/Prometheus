package week02.practic.zad02;

public class MatrixPrint {

    public static void main(String args[]) {
        int dim = 9;
        int[][] arr = new int[dim][dim];

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {
                arr[i][j] = i*5 + j + 1 ;
                if (i==j || (j + i)==arr[i].length-1) System.out.print(" " + '*' +" ");
                else if (arr[i][j]<10) System.out.print(" " + arr[i][j]+ " ");
                else System.out.print(arr[i][j] + " ");
        }
            System.out.println();
        }

        }

}