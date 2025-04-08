public class Main {
    public static void main(String[] args) {

        int tabuada = 1;

        while (tabuada <= 10){
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
            System.out.println("\n");
            tabuada++;
        }
    }
}