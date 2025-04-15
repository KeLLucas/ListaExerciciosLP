import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = read.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = read.nextFloat();
        System.out.print("Digite a terceira nota do aluno: ");
        nota3 = read.nextFloat();
        System.out.print("Digite a quarta nota do aluno: ");
        nota4 = read.nextFloat();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
        
        if (media >= 8.5) {
            System.out.println("Sua nota foi -> A <-");
        } else if (media < 8.5 && media >= 7) {
            System.out.println("Sua nota foi -> B <-");
        } else if (media < 7 && media >= 5) {
            System.out.println("Sua nota foi -> C <-");
        }else {
            System.out.println("Sua nota foi -> D <-");
        }
    }
}
