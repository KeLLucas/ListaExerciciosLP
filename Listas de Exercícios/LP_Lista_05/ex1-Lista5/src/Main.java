import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //teste
        int [] vetor = new int[10];

        System.out.println("Digite os 10 valores do vetor");

        for (int i = 0; i < 10; i++){
            vetor[i] = read.nextInt();
        }

        for (int i = 9; i >= 0; i--){
            System.out.print(vetor[i]);
            System.out.print(" ");

        }
    }
}