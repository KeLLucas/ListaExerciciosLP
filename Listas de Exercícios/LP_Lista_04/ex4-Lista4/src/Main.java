import java.text.ChoiceFormat;

public class Main {
    public static void main(String[] args) {
        for (int i = -80; i <= 80; i++){
            System.out.println("| Celcius | Fahrenheit | \n    "+ i  + "        " + String.format("%.2f",1.8 * i + 32));
            System.out.println();
        }
    }
}