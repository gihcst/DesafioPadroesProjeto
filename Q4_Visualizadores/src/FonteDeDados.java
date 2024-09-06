import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//subject que gerencia e notifica os observadores
public class FonteDeDados{ 
    private List<Integer> lst;
    private List<Observador> observadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores = new ArrayList<>();
    }

    public void adcObservador(Observador obs){
        observadores.add(obs);
    }

    public void rmvObservador(Observador obs){
        observadores.remove(obs);
    }

    public void notificaObs(){
        for(Observador obs : observadores){
            obs.notifica();
        }
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificaObs();
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}