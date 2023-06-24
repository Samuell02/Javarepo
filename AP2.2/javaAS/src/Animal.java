import java.util.Objects;

public class Animal {

    private String nome;
    private String idade;
    private String peso;
    private String especie;
 public void Movimentar(String especie){
     if (Objects.equals(especie, "ave")) {
         System.out.println(" A ave saltita até a agua.");
     }else if (Objects.equals(especie, "mamifero")){
         System.out.println("O mamifero anda em circulos");
     }
 }
    public void AdicionarAnimal(String newName, String novaidade, String novopeso, String novaespecie) {
        this.nome = newName;
        this.idade = novaidade;
        this.peso = novopeso;
        this.especie = novaespecie;
    }

    public void Movimentar() {
        System.out.println("O animal lentamente se aproxima do painel");
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    public class ave implements Treinavel{
        public double envergaduraAsa;

        void voar(){
            System.out.println("a ave está voando");

        }
       public  void realizarTruque() {
            System.out.println("A ave fez um truque voador");
        }
    }
    public class mamifero{
        public String tipopelagem;
        void amamentar () {
            System.out.println("O mamífero está amamentando");
        }




    }

}
