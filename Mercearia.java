class Mercearia extends Produto{
    private String nome;
    private String marca;
    private int quantidade;

    public Mercearia(String nome, String marca, Data validade, double peso, String codigo_de_barra){
        super(validade, peso, codigo_de_barra);
        this.nome = nome;
        this.marca = marca;
        this.quantidade = 0;
    }

    public void set_quantidade(int quantidade){
        if(quantidade > 0){
            this.quantidade = quantidade;
            return;
        }
        System.out.println("Quantidade precisa ser maior que 0!");
    }

    public double calcula_lucro(){
        return (this.preco_final - this.preco_compra) * this.quantidade;
    }

    public String[] get_mercearia_String(){
        String auxiliar[] = new String[2];
        auxiliar[0] = this.nome;
        auxiliar[1] = this.marca;
        return auxiliar;
    }

    public int get_quantidade(){
        return this.quantidade;
    }
}