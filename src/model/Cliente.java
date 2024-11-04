package model;

public class Cliente extends Pessoa{
    private String cpf;

    public Cliente() {
        super();
        cpf = new String();
    }

    public Cliente(int id, String nome, String email, Cliente cliente, String cpf) {
        super(id, nome, email, cliente);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
