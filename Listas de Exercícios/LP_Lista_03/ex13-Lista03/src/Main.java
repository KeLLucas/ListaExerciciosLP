import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int escolha;
        float base, altura, raio;
        double area, perimetro;

        System.out.println("Menu:");
        System.out.println("    1. Círculo");
        System.out.println("    2. Triangulo Retângulo");
        System.out.println("    3. Retângulo");
        System.out.println("----------------------------");
        System.out.print("Escolha uma opção: ");
        escolha = read.nextInt();
        System.out.println("----------------------------");
        switch (escolha){
            case 1:
                System.out.print("Informe o raio: ");
                raio = read.nextInt();
                System.out.println("----------------------------");
                area = (Math.PI * Math.pow(raio,2));
                perimetro = (2 * Math.PI * raio);
                System.out.println("Área: " + String.format("%.2f",area));
                System.out.print("Perímetro: " + String.format("%.2f",perimetro));
                break;
            case 2:
                System.out.print("Informe a base: ");
                base = read.nextFloat();
                System.out.print("Informe a altura: ");
                altura = read.nextFloat();
                System.out.println("----------------------------");
                area = (base * altura) / 2;
                perimetro = Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2)) + base + altura;
                System.out.println("Área: " + String.format("%.2f",area));
                System.out.print("Perímetro: " + String.format("%.2f",perimetro));
                break;
            case 3:
                System.out.print("Informe a base: ");
                base = read.nextFloat();
                System.out.print("Informe a altura: ");
                altura = read.nextFloat();
                System.out.println("----------------------------");
                area = (base * altura);
                perimetro =  2 * (base  + altura);
                System.out.println("Área: " + String.format("%.2f",area));
                System.out.print("Perímetro: " + String.format("%.2f",perimetro));
                break;
            default:
                System.out.println("opção invalida!");
        }
    }
}