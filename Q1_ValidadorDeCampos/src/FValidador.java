//fábrica de validador que instancia os validadores corretos com base no tipo
public class FValidador {
    public static IValidador fabricaValidador(Tipos tipo){
        switch (tipo) {
            case EMAIL:
                return new ValidadorDeEmail();
            case INTEIRO:
                return new ValidadorDeInteiro();
            case MATRICULA:
                return new ValidadorDeMatricula();
            default:
            throw new IllegalArgumentException("Não existe este tipo. :( ");
        }
    }
}