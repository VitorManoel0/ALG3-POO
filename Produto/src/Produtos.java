public class Produtos {
    private int codigo;
    private String nome;
    private float preco;

    int getCodigo() {
        return this.codigo;
    }

    String getNome() {
        return this.nome;
    }

    float getPreco() {
        return this.preco;
    }

    void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setPreco(float preco) {
        this.preco = preco;
    }

}
