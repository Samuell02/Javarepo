public class Funcionario {

    private String nome;
    private String Cargo;
    private double Salario;
    public class veterinario{
        public String especialidade;

        void realizarExame(Animal animal){
            System.out.println("O veterinário está realizando um exame em"+animal+".");

        }
    }

}
