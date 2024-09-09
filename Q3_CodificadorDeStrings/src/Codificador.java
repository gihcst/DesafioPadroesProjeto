import java.util.HashMap;
import java.util.Map;

public interface ICodificador {
    String codifica(Codificador.Tipo tipo, String str);
    String deCodifica(Codificador.Tipo tipo, String str);
}

public class Codificador implements ICodificador {
    public enum Tipo { SIMPLES, DESLOCA }
    private Map<Character, Character> tabCod;
    private Map<Character, Character> tabDeCod;

    public Codificador() {
        tabCod = new HashMap<>();
        tabCod.put('a', '@');
        tabCod.put('e', '#');
        tabCod.put('i', '!');
        tabCod.put('o', '$');
        tabCod.put('u', '%');
        
        tabDeCod = new HashMap<>();
        tabDeCod.put('@', 'a');
        tabDeCod.put('#', 'e');
        tabDeCod.put('!', 'i');
        tabDeCod.put('$', 'o');
        tabDeCod.put('%', 'u');
    }

    private String codificaSimples(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[aux.length];
        for (int i = 0; i < aux.length; i++) {
            resp[i] = tabCod.getOrDefault(aux[i], aux[i]);
        }
        return new String(resp);
    }

    private String deCodificaSimples(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[aux.length];
        for (int i = 0; i < aux.length; i++) {
            resp[i] = tabDeCod.getOrDefault(aux[i], aux[i]);
        }
        return new String(resp);
    }

    private String codificaDesloca(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[aux.length];
        for (int i = 0; i < aux.length; i++) {
            resp[i] = (char) (aux[i] + 1);
        }
        return new String(resp);
    }

    private String deCodificaDesloca(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[aux.length];
        for (int i = 0; i < aux.length; i++) {
            resp[i] = (char) (aux[i] - 1);
        }
        return new String(resp);
    }

    @Override
    public String codifica(Tipo tipo, String str) {
        switch (tipo) {
            case SIMPLES:
                return codificaSimples(str);
            case DESLOCA:
                return codificaDesloca(str);
            default:
                return str;
        }
    }

    @Override
    public String deCodifica(Tipo tipo, String str) {
        switch (tipo) {
            case SIMPLES:
                return deCodificaSimples(str);
            case DESLOCA:
                return deCodificaDesloca(str);
            default:
                return str;
        }
    }
}

public abstract class CodificadorDecorator implements ICodificador {
    protected ICodificador codificador;

    public CodificadorDecorator(ICodificador codificador) {
        this.codificador = codificador;
    }

    @Override
    public String codifica(Codificador.Tipo tipo, String str) {
        return codificador.codifica(tipo, str);
    }

    @Override
    public String deCodifica(Codificador.Tipo tipo, String str) {
        return codificador.deCodifica(tipo, str);
    }
}

public class ReversoCodificadorDecorator extends CodificadorDecorator {

    public ReversoCodificadorDecorator(ICodificador codificador) {
        super(codificador);
    }

    @Override
    public String codifica(Codificador.Tipo tipo, String str) {
        // Codifica usando o comportamento original
        String res = super.codifica(tipo, str);
        // Adiciona a funcionalidade de inverter a string
        return new StringBuilder(res).reverse().toString();
    }

    @Override
    public String deCodifica(Codificador.Tipo tipo, String str) {
        // Primeiro, reverte a string
        String res = new StringBuilder(str).reverse().toString();
        // Decodifica usando o comportamento original
        return super.deCodifica(tipo, res);
    }
}
