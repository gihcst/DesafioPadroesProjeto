import java.util.List;

public class VisualizadorDeMultiplicacao implements Observador {

    public VisualizadorDeMultiplicacao(FonteDeDados dados) {
        dados.adcObservador(this);
    }

    public void exibeMultiplicacao(List<Integer> dados) {
        Integer mult = dados.stream()
            .reduce(1, (a, b) -> a * b);
        System.out.println("Multiplicação: " + mult + ", quantidade de elementos analisados: " + dados.size());
    }

    public void notificacaoRecebida(List<Integer> valores) {
        exibeMultiplicacao(valores);
    }
}
