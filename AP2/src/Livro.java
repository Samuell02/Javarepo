public class Livro  extends  Produto {
    private String Título;
    private String Autor;
    private String AnodePublicaçao;

    private String Disponibilidade;

    private String Volume;
    public void setTítulo(String novoTítulo,String novovolume) {
        this.Título = novoTítulo;
        this.Volume= novovolume;
    }
    public void setTítulo(String novoTítulo) {
        this.Título = novoTítulo;
        this.Volume= novovolume;
    }
    public void DetalhesDoProduto(){

    }
}
