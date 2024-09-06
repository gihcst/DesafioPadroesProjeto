import java.util.List;
//observador
public class VisualizadorDeMedia implements Observador{
    private FonteDeDados fonte; //observa a fonte de dados

    public VisualizadorDeMedia(FonteDeDados fonte){
        this.fonte = fonte;
        fonte.adcObservador(this);
    }

    public void exibeMedia(){
        List<Integer> dados = fonte.getValores();
        double media = dados.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+ dados.size());
    }

    public void notifica(){
        exibeMedia();
    }
}
