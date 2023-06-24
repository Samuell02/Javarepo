public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i;
        double z = 0.0;
        int y = 4;
        double[] notas = {8.5, 7.0, 9.0, 6.5, 10.0};
        for (i = 0; i < notas.length; i++) {
            z = notas[i] + z;

        }
        System.out.println(z/5);

    }
}