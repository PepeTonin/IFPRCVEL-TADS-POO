
import java.util.Scanner;

public class Atv1 {

    public void somaTerminal() {
        double resultado = 0;
        double entrada = 1;
        var scan = new Scanner(System.in);

        while (entrada != 0) {
            try {
                System.out.print("Digite um número para somar (0 se deseja para e somar os digitados): ");
                entrada = scan.nextDouble();
            } catch (Exception e) {
                scan.nextLine();
                continue;
            }
            resultado += entrada;
        }
        System.out.println("A soma dos numeros e: " + resultado);
        scan.close();
    }

    public static void main(String[] args) {
        var atividade = new Atv1();
        atividade.somaTerminal();
    }

}
