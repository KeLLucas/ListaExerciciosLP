import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        float nota1, nota2, media, notaRecuperacao;

        System.out.printf("Digite a primeria nota do aluno: ");
        nota1 = read.nextFloat();
        System.out.printf("Digite a segunda nota do aluno: ");
        nota2 = read.nextFloat();
        
        media = (nota1 + nota2) / 2;
        
        if (media >= 50) {
            System.out.printf("Sua nota foi de -> "+ media +" <- Aprovado!");
        } else {
            System.out.printf("Sua nota não foi o suficiente, digite a nota da prova de recuperação: ");
            notaRecuperacao = read.nextFloat();

            media = (media + notaRecuperacao) / 2;

            if (media > 50) {
                System.out.printf("Sua nota "+ media + " não foi o suficiente, REPROVADO!");
            } else {
                System.out.printf("Sua nota foi de -> " + media + " <- Aprovado!");
            }
        }
    }
}
