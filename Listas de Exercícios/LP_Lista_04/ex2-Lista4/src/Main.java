import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number, maior, menor;

        System.out.println("Type a number:");
        number = read.nextInt();

        maior = number;
        menor = number;

        for (int i = 0; i <= 4; i++) {
            System.out.println("Type another number:");
            number = read.nextInt();
            if (number > maior){
                maior = number;
            } else if (number < menor) {
                menor = number;
            }
        }
        if (maior == menor){
            System.out.println("Os numero tem o mesmo valor");
        }else {
            System.out.println("O maior numero digitado foi o " + maior);
            System.out.println("O menor numero digitado foi " + menor);
        }
    }
}


