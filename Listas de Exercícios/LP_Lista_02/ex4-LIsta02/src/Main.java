import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float nota1, nota2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = in.nextFloat();

        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = in.nextFloat();

        System.out.println("A media do aluno foi de " + ((nota1 + nota2) / 2.0));

    }
}