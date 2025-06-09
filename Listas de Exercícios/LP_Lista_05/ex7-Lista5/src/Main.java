import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int somaLinha = 0, somaCol = 0, aux = 0, col = 0, contr = 1;
        int[][] matrix = {{1, 3, 5, 7, 4}, //20
                {2, 4, 6, 8, 5}, // 25
                {5, 7, 2, 2, 6}, // 22
                {4, 7, 2, 1, 9}, //23
                {2, 1, 11, 2, 3}}; // 19};

        System.out.println("\n");
        System.out.println("=================== Linhas ===================");
        for (int [] i:matrix){
            if (somaLinha < aux){
                somaLinha = aux;
                col++;
            }
            aux =0;
            System.out.print("Linha " + ((contr ++) + "  \t"));
            for (int j:i){
                System.out.print(j + "\t");
                aux +=j;
            }

            System.out.println("--> " + aux);
            System.out.println("==============================================");

        }
        System.out.println("A maior soma das linhas é de " + somaLinha + " na coluna " + (col));

        col = 0;
        System.out.println("\n\n");
        System.out.println("=================== Colunas ===================");
        for (int coluna = 0; coluna < matrix[0].length; coluna++){
            if (somaCol < aux) {
                somaCol = aux;
                col ++;
            }
            aux = 0;
            System.out.print("Coluna " + (coluna + 1) + "\t");

            for (int linha = 0; linha < matrix.length; linha++){
                System.out.print(matrix[linha][coluna] + "\t");

                aux += matrix[linha][coluna];

            }
            System.out.println( "--> " + aux + " ");
            System.out.println("===============================================");
        }
        System.out.println("A maior soma das colunas é de " + somaCol + " na coluna " + (col));
    }
}