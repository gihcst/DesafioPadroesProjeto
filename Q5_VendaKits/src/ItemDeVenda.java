public class ItemDeVenda {
    private Componente componente; //tipo componente para poder criar ambos os itens, seja kit ou produto unitário.
    private int quantidade;

    public ItemDeVenda(Componente componente, int quantidade) {
        this.componente = componente;
        this.quantidade = quantidade;
    }

    public Componente getProduto() {
        return componente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubTotal() {
        return componente.precoTotal() * quantidade;
    }

    @Override
    public String toString() { //toString para ambos os tipos de intens de venda
        if(componente instanceof Produto){
            Produto produto = (Produto) componente;
            return String.format("%d %s %d x %.2f = %.2f%n",produto.getId(), produto.getNome(), quantidade, produto.precoTotal(), getSubTotal());
        }
        else{
            ProdutoKit kit = (ProdutoKit) componente;
            return String.format("%s (Kit) %d x %.2f = %.2f%n", 
            kit.getNome(), quantidade, kit.precoTotal(), getSubTotal());
        }
    }
}