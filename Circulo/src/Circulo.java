public class Circulo {
    private String nome;
    private float raio;

    String getNome (){
        return this.nome;
    }
    float getRaio () {
        return this.raio;
    }

    void setNome (String nome){
        this.nome = nome;
    }
    void setRaio (float raio){
        this.raio = raio;
    }

    float diameter (){
        return this.raio * 2;
    }

    float area (){
        return (this.raio*this.raio) * 3.14f;
    }

    float circunferencia (){
        return this.diameter() * 3.14f;
    }
}