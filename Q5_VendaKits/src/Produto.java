public class Produto implements Componente{ //classe folha que utiliza a interface em comum com a classe compositive
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double precoTotal() {
        return preco;    
    }

}
