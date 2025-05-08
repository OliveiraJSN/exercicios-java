public class Main{
    public static void main(String[] args) {
        Data data1 = new Data(14, 05, 2025);
        Limpeza limpezavetor[] = new Limpeza[5];
        String nome[] = new String[]{"Sabão", "Agua Sanitaria", "Shampoo", "Creme Dental", "Detergente"};
        String marca[] = new String[]{"Alpha", "Beta", "Omega", "Zeta", "Pi"};
        int quantidade[] = new int[]{10, 15, 20, 30, 5};
        for(int i = 0; i < 5; i++){
            limpezavetor[i] = new Limpeza(nome[i], marca[i], quantidade[i], data1, 0, 0);
        }
    }
}