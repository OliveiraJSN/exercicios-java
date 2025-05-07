class Mercearia{
    private String nome;
    private String marca;
    private int quantidade;

    pulblic Mercearia(String nome, String marca){
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

    }

    public String[] get_mercearia_String(){
        String auxiliar[] = new String[2];
        auxiliar[0] = this.nome;
        auxiliar[1] = this.marca;
    }

    public int get_quantidade(){
        return this.quantidade;
    }
}