import java.util.List;

public class VisualizadorDeMedia implements Observador {

    public VisualizadorDeMedia(FonteDeDados dados) {
        dados.adcObservador(this);
    }

    public void exibeMedia(List<Integer> dados) {
        double media = dados.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: " + media + ", quantidade de elementos analisados: " + dados.size());
    }

    public void notificacaoRecebida(List<Integer> valores) {
        exibeMedia(valores);
    }
}
