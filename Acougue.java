class Acougue extends Produto{
    private String frigorifico;
    private String animal;
    private String corte;

    public Acougue(String frigorifico, String animal, String corte, Data validade, double peso, String codigo_de_barra){
        super(validade, peso, codigo_de_barra);
        this.frigorifico = frigorifico;
        this.animal = animal;
        this.corte = corte;
    }

    public double calcula_lucro(){
        return (this.preco_final - this.preco_compra) * this.peso;
    }

    public String[] get_animal_corte(){
        String auxiliar[] = new String[3];
        auxiliar[0] = this.frigorifico;
        auxiliar[1] = this.animal;
        auxiliar[2] = this.corte;
        return auxiliar;
    }


}