public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (mes <= 12 & mes >= 1) {
            this.mes = mes;
        } else {
            System.out.println("Mes invalido!");
            this.mes = 0;
        }

        if (mes == 4 | mes == 6 | mes == 9 | mes == 11) {
            if (dia >= 1 & dia <= 30) {
                this.dia = dia;
            } else {
                System.out.println("Dia invalido!");
                this.dia = 0;
            }
        } else if (mes == 2) {
            if (ano % 4 == 0) {
                if (dia >= 1 & dia <= 29) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia invalido!");
                    this.dia = 0;
                }
            } else {
                if (dia >= 1 & dia <= 28) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia invalido!");
                    this.dia = 0;
                }
            }
        } else {
            if (dia >= 1 & dia <= 31) {
                this.dia = dia;
            } else {
                System.out.println("Dia invalido!");
                this.dia = 0;
            }
        }
    }

    public int[] getData() {
        int data[] = new int[3];
        data[0] = this.dia;
        data[1] = this.mes;
        data[2] = this.ano;
        return data;
    }
}