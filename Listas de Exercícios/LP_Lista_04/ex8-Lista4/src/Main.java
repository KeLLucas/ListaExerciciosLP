import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero, n;
        boolean primo;

        numero = 2;
        primo = true;
        n = read.nextInt();

        while (numero <= n - 1){
            if (n % numero == 0) {
                primo = false;
                break;
            }
            numero++;
        }

        if (primo) {
            System.out.println("E primo");
        }else {
            System.out.println("Nao e primo");
        }
    }
}