import java.util.List;

public class VisualizadorDeSomatorio implements Observador {

    public VisualizadorDeSomatorio(FonteDeDados dados) {
        dados.adcObservador(this);
    }

    public void exibeSomatorio(List<Integer> dados) {
        Integer soma = dados.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: " + soma + ", quantidade de elementos analisados: " + dados.size());
    }

    public void notificacaoRecebida(List<Integer> valores) {
        exibeSomatorio(valores);
    }
}
