### Atividade 06
Para a resolução desta atividade realizei os sguinte passos:


#### Código:
```
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double taxaDeJuros = 0.005, depositoMensal, montanteDesejado;
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor do depósito mensal: ");
        depositoMensal = scan.nextDouble();
        System.out.print("Valor do montante desejado: ");
        montanteDesejado = scan.nextDouble();
        int numeroDeDepositos = 0;
        double auxTempo, montanteFinal = 0;
        do {
            numeroDeDepositos++;
            auxTempo = Math.pow((1 + taxaDeJuros), numeroDeDepositos);
            montanteFinal = depositoMensal * (1 + taxaDeJuros) * ((auxTempo - 1) / taxaDeJuros);
        } while (montanteFinal < montanteDesejado);
        System.out.println(
                "Considerando taxa de juros mensais de " + taxaDeJuros * 100 + "%, demorarão " + numeroDeDepositos
                        + " meses para se atingir o montante desejado");
        scan.close();
    }
}
```
