
public class Main   {


    public static void main(String[] args) {
        System.out.println("Hello world!");
           Livro livro1 =  new Livro("Dito e feito", "Jennifer Armstrong / Kimberly Bulcken Root","2006","Sim","Unico");
           livro1.setGenero("infantil");
           livro1.setEditora("Brinque Book");
        Livro livro2 =  new Livro("O ladrão de raios","Rick Riordan","2005","Não","1 de 5");
        livro2.setGenero("Fantasia urbana");
        livro2.setEditora(" Intrínseca");
        Livro livro3 =  new Livro("","","","","");

        Livro livro4 =  new Livro("O Mágico de Oz","L. Frank Braum","2017(Publicação original em  1900)","Não","Unico");
        livro4.setGenero("Alta Fantasia");
        livro4.setEditora("Companhia de Bolso");
        Livro livro5 =  new Livro("Capitaos da areia","Jorge Amadu ","2009(Publicação original em 1912)","Sim","Unico");
        livro5.setGenero("Drama");
        livro5.setEditora("Companhia de Bolso");

        Biblioteca biblioteca1 = new Biblioteca(livro1,livro2,livro3,livro4,livro5);

         biblioteca1.adicionarLivro3(livro3,"A casa amarela","Unico","infantil","2011","Sarah M. Broom","Somos Livros");
        System.out.println(livro3.detalhesDoProduto());
        System.out.println(livro3.getGenero());
        System.out.println(livro3.getEditora());
        biblioteca1.removerLivro("A casa amarela");
        biblioteca1.AtualizarLivro5(livro5 ,"Capitães da areia","Jorge Amado ","Drama","2009(Publicação original em 1937)","Jorge Amado","Não","Companhia de Bolso");
        System.out.println(biblioteca1.livro4.detalhesDoProduto());
        System.out.println(biblioteca1.livro4.getGenero());
        System.out.println(biblioteca1.livro4.getEditora());
        System.out.println(biblioteca1.livro5.detalhesDoProduto());
        System.out.println(biblioteca1.livro5.getGenero());
        System.out.println(biblioteca1.livro5.getEditora());


    }
}