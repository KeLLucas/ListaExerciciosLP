// importar Scanner para leitura de ‘input’ do utilizador//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Variáveis
        int numero, dobro;

        //Leitura do número fornecido pelo utilizador
        System.out.print("Digite um número inteiro: ");
        numero = read.nextInt();

        //Calculando seu dobro
        dobro = numero * 2;

        System.out.println("O dobro do número " + numero + " é igual a " + dobro);
    }
}