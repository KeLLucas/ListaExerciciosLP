import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] v2 = new int[v1.length];
        int inverter = v1.length;


        for (int i = 0; i < v1.length; i++){
            v2[i] = v1[inverter - 1];
            inverter--;
        }

        System.out.print("Vetor v1 --> "+ Arrays.toString(v1));
        System.out.println();
        System.out.print("Vetor v2 (invertido) --> " + Arrays.toString(v2));
    }
}