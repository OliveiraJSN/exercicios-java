class Padaria extends Produto{
    private String nome;
    private double preco_por_kilo;

    public Padaria(String nome, double preco_por_kilo, Data validade, double peso, String codigo_de_barra){
        super(validade, peso, codigo_de_barra);
        this.nome = nome;
        if(preco_por_kilo > 0){
            this.preco_por_kilo = preco_por_kilo;
        } else{
            this.preco_por_kilo = 1;
        }
        this.validade = validade;
    }

    public void set_preco_por_kilo(double preco_por_kilo){
        if(preco_por_kilo > 0){
            this.preco_por_kilo = preco_por_kilo;
            return;
        }
        System.out.println("O valor precisa ser maior que 0!");
    }

    public double calcula_lucro(){
        
    }

    public double get_preco_por_kilo(){
        return this.preco_por_kilo;
    }

    public String get_nome(){
        return this.nome;
    }
}

