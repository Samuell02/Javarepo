public class CartaoDeCredito extends  Pagamento{
    int senha;
    double saldo;
    double preço;

    double troco;

    String nomedoserviço;
    String local;

    String nomedocliente;


    public void realizarPagamento(){
      saldo = saldo - preço;


    }
    public void EmitirRecibo(){
        System.out.println("Preço;" );
        System.out.println(preço);
        System.out.println("Nome Do Cliente:" );

        System.out.println(nomedocliente);
        System.out.println("Nome do Serviço;" );

        System.out.println(nomedoserviço);
        System.out.println("Local:");

        System.out.println(local);




    }
}
