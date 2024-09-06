import java.util.List;
//observador
public class VisualizadorDeSomatorio implements Observador {
    private FonteDeDados fonte;

    public VisualizadorDeSomatorio(FonteDeDados fonte){
        this.fonte = fonte;
        fonte.adcObservador(this);
    }

    public void exibeSomatorio(){
        List<Integer> dados = fonte.getValores();
        Integer soma = dados.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+ dados.size());
    }

    public void notifica(){
        exibeSomatorio();
    }
}
