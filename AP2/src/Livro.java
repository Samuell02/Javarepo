public class Livro  extends  Produto {
    private String Título;

    private String Autor;

int max = 999999;
int min = 100000;

    private String AnodePublicaçao;

    private String Disponibilidade;

    private String Volume;

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
