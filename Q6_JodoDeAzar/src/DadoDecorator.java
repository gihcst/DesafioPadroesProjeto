public abstract class DadoDecorator implements Dado {
    protected final Dado dadoDecorado;

    public DadoDecorator(Dado dadoDecorado) {
        this.dadoDecorado = dadoDecorado;
    }

    @Override
    public void lançar() {
        dadoDecorado.lançar();
    }

    @Override
    public int getValor() {
        return dadoDecorado.getValor();
    }
}
