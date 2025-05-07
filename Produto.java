class Produto(){
    protected double preco_compra;
    protected double preco_final;
    protected Data validade;
    protected double peso;
    protected String codigo_de_barra;

    public Produto(Data validade, double peso, String codigo_de_barra){
        this.validade = validade;
        if (peso > 0){
        this.peso = peso;
        } else {
            this.peso = 0;
            System.out.println("Peso não pode ser menor que 0!")
        }
        this.codigo_de_barra = codigo_de_barra;
        this.preco_final = 9999999.99;
        this.preco_compra = 0;
    }

    public void set_preco_final(double preco_final){
        if(preco_final > 0){
            this.preco_final = preco_final;
            return;
            }
        System.out.println("O valor não pode ser negativo!");
           
        }
    

    public void set_preco_compra(double preco_compra){
        if(preco_compra > 0){
            this.preco_compra = preco_compra;
            return;
            }
        System.out.println("O valor não pode ser negativo!");
    }

    public double[] get_preco_peso(){
        double auxiliar[] = new double[3];
        auxiliar[0] = this.preco_compra;
        auxiliar[1] = this.preco_final;
        auxiliar[2] = this.peso;
        return auxiliar;
    }

    public String get_codigo(){
        return this.codigo_de_barra;
    }

    public Data get_validade(){
        return this.validade;
    }
}