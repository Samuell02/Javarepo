public class Main {
    public static void main(String[] args) {
        // Crie alguns livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("Para matar um Mockingbird", "Harper Lee", 1960);

        // Crie uma biblioteca
        Biblioteca biblioteca = new Biblioteca(livro1, livro2, livro3);

        // Verifique a disponibilidade de um livro
        biblioteca.verificarDisponibilidade("1984");  // Deve imprimir: Disponível

        // Atualize os detalhes de um livro
        biblioteca.atualizarDetalhesDoLivro("1984", "George Orwell", 1950);

        // Remova um livro
        biblioteca.removerLivro("Para matar um Mockingbird");

        // Adicione um novo livro
        Livro livro4 = new Livro("Duna", "Frank Herbert", 1965);
        biblioteca.adicionarLivro(livro4);

        // Use a sobrecarga de métodos
        livro4.setTitulo("Duna");  // Define o título e a edição

        // Imprima os detalhes de todos os livros
        System.out.println(livro1.detalhesDoProduto());
        System.out.println(livro2.detalhesDoProduto());
        System.out.println(livro3.detalhesDoProduto());
        System.out.println(livro4.detalhesDoProduto());
    }
}