public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] numerosImpares = {1,3,5,7,9,11,13,15,17,19};

        for (int i = 0; i < numerosImpares.length; i++) {
            if(numerosImpares[i] % 2 == 1) {
                System.out.println(numerosImpares[i]);
            }
        }
    }
}