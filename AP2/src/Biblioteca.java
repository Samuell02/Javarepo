public class Biblioteca {
    Livro livro1;
    Livro livro2;
    Livro livro3;
    Livro livro4;
    Livro livro5;

    public void adicionarLivro1(Livro livro) {
        if (livro != null && livro.getTítulo() != null && !livro.getTítulo().isEmpty()) {
            this.livro1 = livro;
        } else {
            System.out.println("Não é possível adicionar um livro sem título ao slot 1.");
        }
    }

    public void adicionarLivro2(Livro livro) {
        if (livro != null && livro.getTítulo() != null && !livro.getTítulo().isEmpty()) {
            this.livro2 = livro;
        } else {
            System.out.println("Não é possível adicionar um livro sem título ao slot 2.");
        }
    }

    // Métodos semelhantes para adicionarLivro3, adicionarLivro4 e adicionarLivro5...
}