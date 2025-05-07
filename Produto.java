class Produto(){
    protected double preco_compra;
    protected double preco_final;
    protected Data validade;
    protected double peso;
    protected String codigo_de_barra;

    public Produto(Data validade, double peso, String codigo_de_barra){
        this.validade = validade;
        (if peso > 0){
        this.peso = peso;
        } else {
            this.peso = 0;
            System.out.println("Peso não pode ser menor que 0!")
        }
        this.codigo_de_barra = codigo_de_barra;
    }

    public void set_preco_final(double preco_final){

    }

    public void set_preco_compra(double preco_compra){
        
    }

    public double[] get_preco_peso(){
        
    }

    public String get_codigo(){

    }

    public Data get_validade(){

    }
}