import java.util.List;

public class App {
    public static void main(String[] args){
        VendasFachada proc = new VendasEmMemoria();
        List<Produto> produtos = proc.buscarProdutos();
        // venda de produtos unitários
        Venda venda = proc.iniciarVenda();
        proc.registrarVenda(venda, produtos.get(0).getId(), 1);
        proc.registrarVenda(venda, produtos.get(1).getId(), 2);
        System.out.println(proc.emitirComprovante(venda));
        // venda de kit
        ProdutoKit kit = new ProdutoKit("Kit Colorado");
        kit.adcProduto(produtos.get(3));
        kit.adcProduto(produtos.get(4));
        Venda vendadoKit = proc.iniciarVenda();
        proc.registrarVenda(vendadoKit, produtos.get(3).getId(), 1); 
        proc.registrarVenda(vendadoKit, produtos.get(4).getId(), 1); 
        vendadoKit.registrarVenda(kit, 1); 
        System.out.println(proc.emitirComprovante(vendadoKit));
    }
}
