import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int [] vetor = new int[10];

        System.out.println("Digite os 10 valores do vetor");

        for (int i = 0; i < 10; i++){
            vetor[i] = read.nextInt();
        }

        for (int i = 0; i < 10; i++){
            if (i % 2 == 0){
                vetor[i] = vetor[i] + 2;
            }else {
                vetor[i] = vetor[i] * 2;
            }
            System.out.print(vetor[i] + " ");
        }
    }
}