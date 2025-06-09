public class Main {
    public static void main(String[] args) {

        int contr = 0;
        int[][] matrix = {{1, 3, 5, 7, 4},
                {2, 4, 6, 8, 5},
                {5, 7, 2, 2, 6},
                {4, 7, 2, 1, 9},
                {2, 1, 11, 2, 3}};

        System.out.println("A diagonal principal da matriz é composta pelos seguintes valores:");
        for (int i = 0; i < matrix.length; i++){
            if (contr == 0) {
                System.out.print( matrix[i][i]);
            } else if (contr == 1) {
                System.out.print("\n\t" + matrix[i][i]);
            } else if (contr == 2) {
                System.out.print("\n\t\t" + matrix[i][i]);
            }else if (contr == 3){
                System.out.print("\n\t\t\t" + matrix[i][i]);
            }else if (contr == 4){
            System.out.print("\n\t\t\t\t" + matrix[i][i]);
            }
            contr++;
        }

    }
}