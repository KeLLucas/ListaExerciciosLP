import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);

       int [] vetor = new int[10];
       int maior, menor, numero, posicaoMaior = 0, posicaoMenor = 0;
       System.out.println("Digite um numero");
       numero = read.nextInt();
       maior = numero;
       menor = numero;
       vetor[0] = numero;


       for (int i = 1; i < 10; i++){
       System.out.println("Digite o " + (i+1) + "º numero: ");
           numero = read.nextByte();
           vetor[i] = numero;
           if (numero > maior){
               maior = numero;
               posicaoMaior = i;
           }
           if (numero < menor){
               menor = numero;
               posicaoMenor = i;
           }
       }

        System.out.println("O maior numero digitado é o: " + maior + " e ele esta na posicao " + (posicaoMaior + 1) + " do vetor");
        System.out.println("O menor numero digitado é o: " + menor + " e ele esta na posicao " + (posicaoMenor + 1) + " do vetor");

    }
}