public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copsteindvmucrs.br";
        String inteiro = "15652";
        String matricula = "23111285-5";
        IValidador validador = FValidador.fabricaValidador(Tipos.EMAIL);
        IValidador validadorInt = FValidador.fabricaValidador(Tipos.INTEIRO);
        IValidador validadorMatricula = FValidador.fabricaValidador(Tipos.MATRICULA);

        if (validador.valida(email)) {
            System.out.println(email + " é um email válido!");
        } else {
            System.out.println(email + " não é um email válido!");
        }

        if (validadorInt.valida(inteiro)){
            System.out.println(inteiro + " É UM INT!");
        } else {
            System.out.println("NÃO É UM INT >:(");
        }

        if (validadorMatricula.valida(matricula)){
            System.out.println(matricula + " É UMA MATRICULA!");
        } else {
            System.out.println("NÃO É UMA MATRICULA >:(");
        }

    }
}
