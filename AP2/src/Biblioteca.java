public class Biblioteca extends Livro{
    Livro livro1 = new Livro();
    livro1.setTítulo("s");
 String comparar;
    Livro livro2 = new Livro();
    Livro livro3 = new Livro();
    Livro livro4 = new Livro();
    Livro livro5 = new Livro();

    public void AdicionarLivro(){
        comparar= (livro1.getTítulo());
        if (comparar!= null && comparar!=""){

        }
        else{
       livro1.setTítulo("despacito","1");
        }
    }


}
