package model;

public class Cliente {
    private String nome;
    private String sobrenome;
    private int idade;
    private String telefone;
    private String email;
    private String cpf;
    private String rg;
    private String endereco;
    private String cidade;
    private String estado;

    // Construtor
    public Cliente(
             String nome,
             String sobrenome,
             int idade,
             String telefone,
             String email,
             String cpf,
             String rg,
             String endereco,
             String cidade,
             String estado
    ){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Metodos de retorno
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }
    public String getEndereco() {
       return endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
}