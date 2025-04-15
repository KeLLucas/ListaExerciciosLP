import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        float velocInicial, aceleracao, tempo;

        Scanner in = new Scanner(System.in);

        System.out.println("Qual é a velocidade inicial? ");
        velocInicial = in.nextFloat();

        System.out.println("Qual é a aceleração? ");
        aceleracao = in.nextFloat();

        System.out.println("Qual é o tempo de percurso feito?");
        tempo = in.nextFloat();

        System.out.println("A velocidade é de " + (velocInicial + (aceleracao * tempo)));
    }
}
