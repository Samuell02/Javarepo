public abstract class Produto {

    private int id;



    private String Genero;

    public abstract  void DetalhesDoProduto();

    public String getTítulo() {
        return id;
    }

    public void getId(int novoId) {
        this.id = novoId;

    }
    public String getGenero() {
        return Genero;
    }

    public void setGenero(String novogenero) {
        Genero = novogenero;
    }

}
