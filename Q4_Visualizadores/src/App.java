import java.util.Scanner;
//app com opções para ligar e desligar cada visualizador
public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        VisualizadorDeMedia cm = null;
        VisualizadorDeSomatorio cs = null;
        VisualizadorDeMultiplicacao mult = null;
        int valor = 0;

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEntre um valor positivo maior que zero. Ou zero (0) para fechar o programa:");
            System.out.println("-1: Ligar visualizador de somatório");
            System.out.println("-2: Ligar visualizador de média");
            System.out.println("-3: Ligar visualizador de multiplicação");
            System.out.println("-4: Desligar visualizador de somatório");
            System.out.println("-5: Desligar visualizador de média");
            System.out.println("-6: Desligar visualizador de multiplicação");
            valor = Integer.parseInt(sc.nextLine());

            if (valor == 0) {
                break;
            }

            switch (valor) {
                case -1:
                    if (cs == null) {
                        cs = new VisualizadorDeSomatorio(dados);
                        System.out.println("Visualizador de somatório ligado!");
                    } else {
                        System.out.println("Visualizador de somatório já está ligado. :)");
                    }
                    break;

                case -2:
                    if (cm == null) {
                        cm = new VisualizadorDeMedia(dados);
                        System.out.println("Visualizador de média ligado!");
                    } else {
                        System.out.println("Visualizador de média já está ligado. :)");
                    }
                    break;

                case -3:
                    if (mult == null) {
                        mult = new VisualizadorDeMultiplicacao(dados);
                        System.out.println("Visualizador de multiplicação ligado!");
                    } else {
                        System.out.println("Visualizador de multiplicação já está ligado. :)");
                    }
                    break;

                case -4:
                    if (cs != null) {
                        dados.rmvObservador(cs);
                        cs = null;
                        System.out.println("Visualizador de somatório desligado!");
                    } else {
                        System.out.println("Visualizador de somatório já está desligado. :)");
                    }
                    break;

                case -5:
                    if (cm != null) {
                        dados.rmvObservador(cm);
                        cm = null;
                        System.out.println("Visualizador de média desligado!");
                    } else {
                        System.out.println("Visualizador de média já está desligado. :)");
                    }
                    break;

                case -6:
                    if (mult != null) {
                        dados.rmvObservador(mult);
                        mult = null;
                        System.out.println("Visualizador de multiplicação desligado!");
                    } else {
                        System.out.println("Visualizador de multiplicação já está desligado. :)");
                    }
                    break;

                default:
                    if (valor > 0) {
                        dados.add(valor);
                    } else {
                        System.out.println("Opção inválida :(");
                    }
                    break;
            }
        }
        sc.close();
    }
}
