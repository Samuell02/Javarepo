public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 0;
        int z = 0;
        int[] valores = { 23, 1, 34, 89, 2};
        for (i = 0 ; i < valores.length; i++) {
         if (valores[i] > z){
             z = valores[i];
         }
        }
        System.out.println(z);

    }
}