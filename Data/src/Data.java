public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 31 && dia > 0) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 12 && mes > 0) {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 31 && ano > 0) {
            this.ano = ano;
        }
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }


}

