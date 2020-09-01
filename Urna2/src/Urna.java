public class Urna {
    private int brancos = 0;
    private int nulos = 0;
    private int candidato1 = 0;
    private int candidato2 = 0;


    int getBrancos () {return this.brancos;}
    int getNulos () {return this.nulos;}
    int getCandidado1 (){return this.candidato1;}
    int getCandidado2 () {return this.candidato2;}

    void setBrancos (int brancos) {this.brancos = brancos;}
    void setNulos (int nulos) {this.nulos = nulos;}
    void setCandidato1 (int candidato1) {this.candidato1 = candidato1;}
    void setCandidato2 (int candidato2) {this.candidato2 = candidato2;}

    int votosb () {
        this.brancos = this.brancos + 1;
        return this.brancos;
    }
    int votosn () {
        this.nulos = this.nulos + 1;
        return this.nulos;
    }
    int votos1 () {
        this.candidato1 = this.candidato1 + 1;
        return this.candidato1;
    }
    int votos2 () {
        this.candidato2 = this.candidato2 + 1;
        return this.candidato2;
    }
}
