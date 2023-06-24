public class Funcionario {

    private String nome;
    private String Cargo;
    private double Salario;

    public void setNome(String novonome, String novocargo, double novoSalario) {
        this.nome = novonome;
        this.Cargo = novocargo;
        this.Salario = novoSalario;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }

    public void setSalario(double novoSalario) {
        this.Salario = novoSalario;
    }

    public void setNome(String novonome) {
        this.nome = novonome;
    }

    public class veterinario{
        public String especialidade;

        public void realizarExame(Animal animal){
            System.out.println("O veterinário está realizando um exame em"+animal.getNome()+".");

        }
    }

}
