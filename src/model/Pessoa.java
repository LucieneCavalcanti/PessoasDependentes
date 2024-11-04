package model;
public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private Cidade cidade;
    
    public Pessoa() {
        id=0;
        nome = new String();
        email = new String();
        cidade = new Cidade();
    }

    public Pessoa(int id, String nome, String email, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
}
