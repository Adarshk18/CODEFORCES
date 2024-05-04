import java.util.Scanner;

public class beautiful_matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        int rowofOne = 0,colofOne =0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = in.nextInt();
                if (matrix[i][j]==1){
                    rowofOne = i;
                    colofOne = j;
                }
            }
        }
        int movesRow = Math.abs(2-rowofOne);
        int movesCol = Math.abs(2-colofOne);

        System.out.println(movesRow+movesCol);
    }
}
