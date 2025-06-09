import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.printf("Digite a primeira nota do aluno: ");
        nota1 = read.nextFloat();
        System.out.printf("Digite a segunda nota do aluno: ");
        nota2 = read.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.printf( (media < 50) ? "Reprovado!" : "Aprovado!" );
    }
}
