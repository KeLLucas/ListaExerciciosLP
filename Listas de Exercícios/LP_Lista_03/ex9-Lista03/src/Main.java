import  java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.print("Digite a medida do primeiro lado do triângulo: ");
        lado1 = read.nextInt();
        System.out.print("Digite a medida do segundo lado do triângulo: ");
        lado2 = read.nextInt();
        System.out.print("Digite a medida do terceiro lado do triângulo: ");
        lado3 = read.nextInt();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            System.out.println("Pode formar um triângulo");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Esse triângulo é equilátero!");
            }else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Esse triângulo é escaleno!");
            } else {
                System.out.println("Esse triângulo é isósceles!");
            }
        }else {
            System.out.println("Não forma um triângulo");
        }
    }
}
