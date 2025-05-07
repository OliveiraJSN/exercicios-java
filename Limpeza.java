class Limpeza{
    private String nome;
    private String marca;
    private int quantidade;

    public Limpeza(String nome, String marca, int quantidade){
        this.nome = nome;
        this.marca = marca;
        if(quantidade > 0){
        this.quantidade = quantidade;
        } else{
            this.quantidade = 0;
            System.out.println("Quantidade não pode ser menor que 0!");
        }
    }

    public String[] get_nome_marca(){
        String auxiliar[] = new String[2];
        auxiliar[0] = this.nome;
        auxiliar[1] = this.marca;
    }

    public int get_quantidade(){
        return this.quantidade;
    }

    public void set_quantidade(int quantidade){
        if(quantidade > 0){
            this.quantidade = quantidade;
            return;
        } 
        System.out.println("Quantidade precisa ser maior que 0!");
        
    }

    public double calcula_lucro(){

    }
}