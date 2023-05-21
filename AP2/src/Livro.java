public class Livro  extends  Produto {
    private String Título;

    private String Autor;


    private String AnodePublicaçao;

    private String Disponibilidade;

    private String Volume;

    public Livro(String título, String autor, String anodePublicaçao, String disponibilidade, String volume) {
        Título = título;
        Autor = autor;
        AnodePublicaçao = anodePublicaçao;
        Disponibilidade = disponibilidade;
        Volume = volume;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String novoautor) {
        this.Autor = novoautor;
    }

    public String getAnodePublicaçao() {
        return AnodePublicaçao;
    }

    public void setAnodePublicaçao(String novoanodePublicaçao) {
        this.AnodePublicaçao = novoanodePublicaçao;
    }

    public String getDisponibilidade() {
        return Disponibilidade;
    }

    public void setDisponibilidade(String novodisponibilidade) {
        this.Disponibilidade = novodisponibilidade;
    }
    public void setTítulo(String novoTítulo,String novovolume) {
        this.Título = novoTítulo;
        this.Volume= novovolume;
    }

    public String detalhesDoProduto() {
        return "Título: " + getTítulo() + ", Autor: " + Autor + ", Ano de Publicação: " + AnodePublicaçao + ", Disponível: " + Disponibilidade;
    }
    public void setTítulo(String novoTítulo) {
        this.Título = novoTítulo;

    }

    public String getTítulo() {
        return Título;
    }

    public String getVolume() {
        return Volume;
    }
    public void DetalhesDoProduto(){
       getTítulo();
       getVolume();
       getGenero();
       getAnodePublicaçao();
       getDisponibilidade();
       getGenero();
       getEditora();

    }
}
