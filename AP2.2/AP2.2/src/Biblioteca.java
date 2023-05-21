public class Biblioteca {
    private Livro livro1;
    private Livro livro2;
    private Livro livro3;

    public Biblioteca(Livro livro1, Livro livro2, Livro livro3) {
        this.livro1 = livro1;
        this.livro2 = livro2;
        this.livro3 = livro3;
    }

    public void adicionarLivro(Livro novoLivro) {
        if (livro1 == null) {
            livro1 = novoLivro;
        } else if (livro2 == null) {
            livro2 = novoLivro;
        } else {
            livro3 = novoLivro;
        }
    }

    public void removerLivro(String titulo) {
        if (livro1 != null && livro1.getTitulo().equals(titulo)) {
            livro1 = null;
        } else if (livro2 != null && livro2.getTitulo().equals(titulo)) {
            livro2 = null;
        } else if (livro3 != null && livro3.getTitulo().equals(titulo)) {
            livro3 = null;
        }
    }

    public void atualizarDetalhesDoLivro(String titulo, String novoAutor, int novoAnoPublicacao) {
        if (livro1 != null && livro1.getTitulo().equals(titulo)) {
            livro1.setAutor(novoAutor);
            livro1.setAnoPublicacao(novoAnoPublicacao);
        } else if (livro2 != null && livro2.getTitulo().equals(titulo)) {
            livro2.setAutor(novoAutor);
            livro2.setAnoPublicacao(novoAnoPublicacao);
        } else if (livro3 != null && livro3.getTitulo().equals(titulo)) {
            livro3.setAutor(novoAutor);
            livro3.setAnoPublicacao(novoAnoPublicacao);
        }
    }

    public void verificarDisponibilidade(String titulo) {
        if (livro1 != null && livro1.getTitulo().equals(titulo)) {
            System.out.println(livro1.isDisponivel() ? "Disponível" : "Indisponível");
        } else if (livro2 != null && livro2.getTitulo().equals(titulo)) {
            System.out.println(livro2.isDisponivel() ? "Disponível" : "Indisponível");
        } else if (livro3 != null && livro3.getTitulo().equals(titulo)) {
            System.out.println(livro3.isDisponivel() ? "Disponível" : "Indisponível");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}