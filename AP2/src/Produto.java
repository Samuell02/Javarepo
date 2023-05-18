public abstract class Produto {
   private String Título;
    private int id;

    private String Genero;

    public abstract  void DetalhesDoProduto();

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String novoTítulo) {
        this.Título = novoTítulo;
    }
    public void setTítulo(String novoTítulo,String novovolume) {
        this.Título = novoTítulo;

        this.Volume= novovolume;
    }

}
