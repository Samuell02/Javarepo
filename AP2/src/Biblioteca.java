import java.util.Random;

public class Biblioteca  {



    Livro livro1;
    Livro livro2;
    Livro livro3;
    Livro livro4;
    Livro livro5;

    public Biblioteca(Livro livro1, Livro livro2, Livro livro3, Livro livro4, Livro livro5) {
        this.livro1 = livro1;
        this.livro2 = livro2;
        this.livro3 = livro3;
        this.livro4 = livro4;
        this.livro5 = livro5;
    }

    public void adicionarLivro1(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor) {
        if (livro != null && livro.getTítulo() != null && !livro.getTítulo().isEmpty()) {
            this.livro1 = livro;
            livro1.setTítulo(novotitulo);
            livro1.setAutor(Novoauthor);
            livro1.setGenero(novogenero);
            livro1.setAnodePublicaçao(novoanodepublicacao);
            livro1.setDisponibilidade("Sim");

        } else {
            System.out.println("Não é possível adicionar um livro sem título ao slot 2.");
        }
    }

    public void adicionarLivro2(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor) {
        if (livro != null && livro.getTítulo() != null && !livro.getTítulo().isEmpty()) {
            this.livro2 = livro;
            livro2.setTítulo(novotitulo);
            livro2.setAutor(Novoauthor);
            livro2.setGenero(novogenero);
            livro2.setAnodePublicaçao(novoanodepublicacao);
            livro2.setDisponibilidade("Sim");

        } else {
            System.out.println("Não é possível adicionar um livro sem título ao slot 2.");
        }

    }

    public void adicionarLivro3(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor) {
        if (livro != null && livro.getTítulo() != null && !livro.getTítulo().isEmpty()) {
            this.livro3 = livro;
            livro3.setTítulo(novotitulo);
            livro3.setAutor(Novoauthor);
            livro3.setGenero(novogenero);
            livro3.setAnodePublicaçao(novoanodepublicacao);
            livro3.setDisponibilidade("Sim");

        } else {
            System.out.println("Não é possível adicionar um livro sem título ao slot 2.");
        }

    }

    public void adicionarLivro4(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor) {
        if (livro != null && livro.getTítulo() != null && !livro.getTítulo().isEmpty()) {
            this.livro4 = livro;
            livro4.setTítulo(novotitulo);
            livro4.setAutor(Novoauthor);
            livro4.setGenero(novogenero);
            livro4.setAnodePublicaçao(novoanodepublicacao);
            livro4.setDisponibilidade("Sim");

        } else {
            System.out.println("Não é possível adicionar um livro sem título ao slot 2.");
        }
    }

    public void adicionarLivro5(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor) {
        if (livro != null && livro.getTítulo() != null && !livro.getTítulo().isEmpty()) {
            this.livro5 = livro;
            livro5.setTítulo(novotitulo);
            livro5.setAutor(Novoauthor);
            livro5.setGenero(novogenero);
            livro5.setAnodePublicaçao(novoanodepublicacao);
            livro5.setDisponibilidade("Sim");
        } else {
            System.out.println("Não é possível adicionar um livro sem título ao slot 2.");
        }

    }

    public void AtualizarLivro1(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor, String novoDisponibilidade) {
        {
            this.livro1 = livro;
            livro.setTítulo(novotitulo);
            livro.setAutor(Novoauthor);
            livro.setGenero(novogenero);
            livro.setAnodePublicaçao(novoanodepublicacao);
            livro.setDisponibilidade(novoDisponibilidade);



        }

    }

    public void AtualizarLivro2(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor, String novoDisponibilidade) {
        {
            this.livro2 = livro;
            livro2.setTítulo(novotitulo);
            livro2.setAutor(Novoauthor);
            livro2.setGenero(novogenero);
            livro2.setAnodePublicaçao(novoanodepublicacao);
            livro2.setDisponibilidade(novoDisponibilidade);



        }

    }

    public void AtualizarLivro3(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor, String novoDisponibilidade) {
        {
            this.livro3 = livro;
            livro3.setTítulo(novotitulo);
            livro3.setAutor(Novoauthor);
            livro3.setGenero(novogenero);
            livro3.setAnodePublicaçao(novoanodepublicacao);
            livro3.setDisponibilidade(novoDisponibilidade);



        }

    }

    public void AtualizarLivro4(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor, String novoDisponibilidade) {
        {
            this.livro5 = livro;
            livro4.setTítulo(novotitulo);
            livro4.setAutor(Novoauthor);
            livro4.setGenero(novogenero);
            livro4.setAnodePublicaçao(novoanodepublicacao);
            livro4.setDisponibilidade(novoDisponibilidade);



        }

    }

    public void AtualizarLivro5(Livro livro, String novotitulo, String novogenero, String novoanodepublicacao, String Novoauthor, String novoDisponibilidade) {
        {
            this.livro5 = livro;
            livro5.setTítulo(novotitulo);
            livro5.setAutor(Novoauthor);
            livro5.setGenero(novogenero);
            livro5.setAnodePublicaçao(novoanodepublicacao);
            livro5.setDisponibilidade(novoDisponibilidade);


        }
    }

        public void removerLivro(String novotitulo) {
            if (livro1 != null && livro1.getTítulo().equals(novotitulo)) {
                livro1 = null;
                livro1.setTítulo(null);
            } else if (livro2 != null && livro2.getTítulo().equals(novotitulo)) {
                livro2 = null;
            } else if (livro3 != null && livro3.getTítulo().equals(novotitulo)) {
                livro3.setTítulo(null);
            } else if (livro4 != null && livro4.getTítulo().equals(novotitulo)){
                livro4 = null;

            } else if (livro5 != null && livro5.getTítulo().equals(novotitulo)){
                livro5 = null;

            }
        }

    public void verificarDisponibilidade(String titulo) {
        if (livro1 != null && livro1.getTítulo().equals(titulo)) {
            System.out.println(livro1.getDisponibilidade());
        } else if (livro2 != null && livro2.getTítulo().equals(titulo)) {
            System.out.println(livro2.getDisponibilidade());
        } else if (livro3 != null && livro3.getTítulo().equals(titulo)) {
            System.out.println(livro3.getDisponibilidade());
        } else if (livro4 != null && livro4.getTítulo().equals(titulo)) {
            System.out.println(livro4.getDisponibilidade());
        } else if (livro4 != null && livro4.getTítulo().equals(titulo)) {
            System.out.println(livro4.getDisponibilidade());}
        else {
            System.out.println("Livro não encontrado.");
        }
    }
}
