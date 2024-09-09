import java.util.Random;

public class DadoConcreto implements Dado {
    private final int lados;
    private int valorJogada;
    private final Random random;

    public DadoConcreto(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    @Override
    public void lançar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    @Override
    public int getValor() {
        return valorJogada;
    }
}
