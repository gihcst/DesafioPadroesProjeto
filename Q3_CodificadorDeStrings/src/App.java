public class App {
    public static void main(String[] args) {
        ICodificador codificador = new Codificador();
        ICodificador codificadorReverso = new ReversoCodificadorDecorator(codificador);

        String texto = "codificador";

        String codificado = codificadorReverso.codifica(Codificador.Tipo.SIMPLES, texto);
        System.out.println("Codificado: " + codificado);

        String decodificado = codificadorReverso.deCodifica(Codificador.Tipo.SIMPLES, codificado);
        System.out.println("Decodificado: " + decodificado);
    }
}
 