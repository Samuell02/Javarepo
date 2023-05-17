public class ArquivoImagem  extends  Arquivo{
    public void abrir() {
        System.out.println("Abrindo Imagem...");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando Imagem...");
    }
}
