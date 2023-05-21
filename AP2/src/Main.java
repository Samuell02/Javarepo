
public class Main   {


    public static void main(String[] args) {
        System.out.println("Hello world!");
           Livro livro1 =  new Livro("Dito e feito ", "Jennifer Armstrong / Kimberly Bulcken Root","2006","Sim","Unico");
           livro1.setGenero("infantil");
           livro1.setEditora("Brinque Book");
        Livro livro2 =  new Livro("O ladrão de raios","Rick Riordan","2005","Não","1 de 5");
        Livro livro3 =  new Livro("","","","","");
        Livro livro4 =  new Livro("","","","","");
        Livro livro5 =  new Livro("","","","","");

        Biblioteca biblioteca1 = new Biblioteca(livro1,livro2,livro3,livro4,livro5);
        livro3.setTítulo("Entre nós");


        System.out.println(livro3.getTítulo());
        System.out.println(livro1.detalhesDoProduto());
        
        livro1.detalhesDoProduto();
    }
}