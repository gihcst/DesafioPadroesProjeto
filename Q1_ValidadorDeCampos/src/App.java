public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copsteindvmucrs.br";
        IValidador validador = FValidador.fabricaValidador(Tipos.EMAIL);

        if (validador.valida(email)) {
            System.out.println(email + " é um email válido!");
        } else {
            System.out.println(email + " não é um email válido!");
        }
    }
}
