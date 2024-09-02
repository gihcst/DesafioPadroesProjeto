//classe concreta que valida um Inteiro

public class ValidadorDeinteiro implements IValidador{
    public boolean valida(String valor){
        for(int i=0;i<valor.length();i++){
            if (!Character.isDigit(valor.charAt(i))){
                return false;
            }
        }
        return true;
    }
}