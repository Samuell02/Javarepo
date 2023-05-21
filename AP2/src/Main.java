
public class Main   {


    public static void main(String[] args) {
        System.out.println("Hello world!");
           Livro livro1 =  new Livro("Dito e feito ", "Infantil","2006","Jennifer Armstrong / Kimberly Bulcken Root ","Unico");
        Livro livro2 =  new Livro("","","","","");
        Livro livro3 =  new Livro("","","","","");
        Livro livro4 =  new Livro("","","","","");
        Livro livro5 =  new Livro("","","","","");

        Biblioteca biblioteca1 = new Biblioteca(livro1,livro2,livro3,livro4,livro5);
        livro3.setTítulo("Entre nós");


        biblioteca1.adicionarLivro1(livro1,"Dito e feito ", "Infantil","2006","Jennifer Armstrong / Kimberly Bulcken Root ");
        livro1.setTítulo(" Os pecados de Descartes.");

           livro1.getTítulo();
    }
}