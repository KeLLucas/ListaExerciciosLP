import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] vetor = {0, 1, 2, 3, 4, 5, 6};
        int inverter;

        for (int i = 0; i < vetor.length; i++) {
            inverter = (vetor.length - 1) - i;
            vetor[i] = inverter;
        }

        System.out.println(Arrays.toString(vetor));
    }
}