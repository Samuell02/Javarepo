public abstract class Produto {

    private String Genero;



    private String Editora;

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String novoeditora) {
        Editora = novoeditora;
    }
    public abstract  void DetalhesDoProduto();




    public String getGenero() {
        return Genero;
    }

    public void setGenero(String novogenero) {
        Genero = novogenero;
    }

}