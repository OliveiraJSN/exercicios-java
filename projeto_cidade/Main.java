package projeto_cidade;
public class Main {
    public static void main(String args[]){
        Cidade c1 = new Cidade("Sao josé dos pinhais", 300000, "73010-15");
        Cidade c2 = new Cidade("Curitiba", 2000000, "82980-00");
        Pessoa p1 = new Pessoa("122.088.959-83", "João Oliveira Santos Neto", c2, c1);
        System.out.println("Nome: " + p1.nome);
        System.out.println("CPF: " + p1.cpf);
        System.out.println("Cidade nascimento: " + p1.nascimento);
        System.out.println("Cidade mora: " + p1.vive);
    }
}