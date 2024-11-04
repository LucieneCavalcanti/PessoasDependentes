package model;
public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private Cliente cliente;
    
    public Pessoa() {
        id=0;
        nome = new String();
        email = new String();
        cliente = new Cliente();
    }

    public Pessoa(int id, String nome, String email, Cliente cliente) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
