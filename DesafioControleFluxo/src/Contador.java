import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = terminal.nextInt();

        try {
            Contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Erro na aplicação!");
        }
    }

    static void Contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        int contagem = parametro2 - parametro1;

        if (contagem <= 0) {
            throw new ParametrosInvalidosException(contagem);
        } else {
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número: " + (i + 1));
            }
        }
    }
}
