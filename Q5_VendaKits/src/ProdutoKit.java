import java.util.ArrayList;
import java.util.List;

public class ProdutoKit implements Componente{
    private String nome;
    private List<Componente> componentes;

    public ProdutoKit(String nome){
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adcProduto(Componente componente){
        componentes.add(componente);
    }

    public void rmvProduto(Componente componente){
        componentes.remove(componente);
    }

    @Override
    public double precoTotal() {
        double calculo = 0.0;
        for(Componente c : componentes){
            calculo += c.precoTotal();
        }
        return calculo;
    } 
}
