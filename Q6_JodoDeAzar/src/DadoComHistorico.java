import java.util.ArrayList;
import java.util.List;

public class DadoComHistorico extends DadoDecorator {
    private final List<Integer> historico;

    public DadoComHistorico(Dado dadoDecorado) {
        super(dadoDecorado);
        historico = new ArrayList<>();
    }

    @Override
    public void lançar() {
        super.lançar();
        historico.add(getValor());
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}
