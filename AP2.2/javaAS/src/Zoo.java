public class Zoo {
    private Animal[] animais;
    private Funcionario[] funcionarios;
    private int numeroAnimais = 3;
    private int numeroFuncionarios = 3;

    public Zoo(int numeroAnimais, int numeroFuncionarios) {
        this.animais = new Animal[numeroAnimais];
        this.funcionarios = new Funcionario[numeroFuncionarios];
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public void addAnimal(Animal animal) {
        if (numeroAnimais < animais.length) {
            animais[numeroAnimais] = animal;
            numeroAnimais++;
        } else {
            System.out.println("Não há espaço para mais animais.");
        }
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
