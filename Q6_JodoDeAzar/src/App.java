public class App {
    public static void main(String[] args) {
        Dado dadoSimples = new DadoConcreto(6);
        Dado dadoComHistorico = new DadoComHistorico(new DadoConcreto(6));

        // Lançando dado simples
        dadoSimples.lançar();
        System.out.println("Dado Simples: " + dadoSimples.getValor());

        // Lançando dado com histórico várias vezes
        dadoComHistorico.lançar();
        dadoComHistorico.lançar();
        dadoComHistorico.lançar();
        System.out.println("Dado com Histórico: " + dadoComHistorico.getValor());
        System.out.println("Histórico: " + ((DadoComHistorico) dadoComHistorico).getHistorico());
    }
}
