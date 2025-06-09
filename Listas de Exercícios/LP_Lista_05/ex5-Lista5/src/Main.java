import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] v1 = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
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