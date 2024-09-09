public abstract class CodificadorDecorator implements ICodificador {
    protected ICodificador codificador;

    public CodificadorDecorator(ICodificador codificador) {
        this.codificador = codificador;
    }

    public String codifica(Codificador.Tipo tipo, String str) {
        return codificador.codifica(tipo, str);
    }

    public String deCodifica(Codificador.Tipo tipo, String str) {
        return codificador.deCodifica(tipo, str);
    }
}
