import java.util.List;
//observador
public class VisualizadorDeMultiplicacao implements Observador{
    private FonteDeDados fonte;

    public VisualizadorDeMultiplicacao(FonteDeDados fonte){
        this.fonte = fonte;
        fonte.adcObservador(this);
    }

    public void exibeMultiplicacao(){
        List<Integer> dados = fonte.getValores();
        Integer mult = dados.stream()
            .reduce(1, (a, b) -> a * b);
        System.out.println("Multiplicação: " + mult + ", quantidade de elementos analisados: " + dados.size());
    }

    public void notifica(){
        exibeMultiplicacao();
    }
}