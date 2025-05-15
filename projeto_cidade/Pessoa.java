package projeto_cidade;
public class Pessoa {
    public String cpf;
    public String nome;
    public Cidade nascimento;
    public Cidade vive;

    public Pessoa(String cpf, String nome, Cidade nascimento, Cidade vive){
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.vive = vive;
    }
}
