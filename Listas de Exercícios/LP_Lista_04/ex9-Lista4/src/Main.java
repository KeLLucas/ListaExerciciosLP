import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int resposta, resultado = 0;

        System.out.println("Jogo da Tabuada  - APERTE [0] para INICIAR");
        resposta = read.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int y = 1; y <= 10; y++) {
                System.out.println( "Qual é o resultado de " + i + " x " + y + " = ?");
                resultado = i * y;
                resposta = read.nextInt();
                if (resposta != resultado) {
                    break;
                }else {
                    System.out.println("Resposta certa!");
                }
            }
            if (resposta != resultado) {
                System.out.println("Resposta errada tente de novo!");
                break;
            }
        }
    }
}