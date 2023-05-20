public abstract class Produto {

    private int id;



    private String Genero;



    private String Editora;

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String novoeditora) {
        Editora = novoeditora;
    }
    public abstract  void DetalhesDoProduto();

    public int getId() {
        return id;
    }

    public void setId(int novoId) {
        this.id = novoId;

    }
    public String getGenero() {
        return Genero;
    }

    public void setGenero(String novogenero) {
        Genero = novogenero;
    }

}