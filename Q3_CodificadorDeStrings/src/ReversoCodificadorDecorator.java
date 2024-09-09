public class ReversoCodificadorDecorator extends CodificadorDecorator {

    public ReversoCodificadorDecorator(ICodificador codificador) {
        super(codificador);
    }

    public String codifica(Codificador.Tipo tipo, String str) {
        // Codifica usando o comportamento original
        String res = super.codifica(tipo, str);

        // Adiciona a funcionalidade de inverter a string
        return new StringBuilder(res).reverse().toString();
    }

    public String deCodifica(Codificador.Tipo tipo, String str) {
        // Primeiro, reverte a string
        String res = new StringBuilder(str).reverse().toString();

        // Decodifica usando o comportamento original
        return super.deCodifica(tipo, res);
    }
}
