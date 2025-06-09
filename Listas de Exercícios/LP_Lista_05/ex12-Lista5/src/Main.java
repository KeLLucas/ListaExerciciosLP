public class Main {
    public static void main(String[] args) {
        int determinante;
        int [][] matrizD = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        determinante = matrizD[0][0] * (matrizD[1][1] * matrizD[2][2] - matrizD[1][2] * matrizD[2][1]) - matrizD[0][1] * (matrizD[1][0] * matrizD[2][2] - matrizD[1][2] * matrizD[2][0])
                + matrizD[0][2] * (matrizD[1][0] * matrizD[2][1] - matrizD[1][1] * matrizD[2][0]);

        System.out.println(determinante);
    }
}

