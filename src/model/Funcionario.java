package model;

public class Funcionario extends Pessoa{
    private float salario;

    public Funcionario() {
        super();
        salario = 0;
    }

    public Funcionario(int id, String nome, String email, Cliente cliente, float salario) {
        super(id, nome, email, cliente);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
