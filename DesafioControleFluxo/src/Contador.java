import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o número do primeiro parâmetro");
            int param1 = leitor.nextInt();

            System.out.println("Digite o número do segundo parâmetro");
            int param2 = leitor.nextInt();

            try {
                contar(param1, param2);
            } catch (ParametrosInvalidosException e) {
                System.out.println("O primeiro parametro deve ser maior que o segundo! ");
            }

        } catch( InputMismatchException e ) {
            System.out.println("Parametro Inválido! ");
            System.out.println("O valor deve ser apenas numérico!");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        if(parametro1 < parametro2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = (parametro1 - parametro2);

        for(int iContador = 0; iContador < contagem; iContador++){
            System.out.println(MessageFormat.format("Imprimindo o número {0}", iContador + 1));
        }
    }
}
