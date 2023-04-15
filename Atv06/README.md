### Atividade 06
O passo a passo da resolução do exercício está nos comentários do código abaixo

#### Código:
```
// importação da biblioteca que será usada no programa para receber as entradas do usuário
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // declaração das variáveis que serão utilizadas na parte de receber as entradas
        // do usuário
        // valor do deposito mensal, valor do montante desejado
        Double depositoMensal = null, montanteDesejado = null;
        // instanciando um objeto da classe Scanner
        Scanner scan = new Scanner(System.in);

        // estrutura de repetição do-while para receber o valor do depósito mensal com
        // os devidos tratamentos de erros para as entradas inválidas
        do {
            // estrutura try-catch para tratar os erros
            // erros: entradas não numericas, zero e negativas
            try {
                // recebe a entrada e aloca na variável "depositoMensal"
                System.out.print("Valor do depósito mensal: ");
                depositoMensal = scan.nextDouble();
                // se for 0 ou negativo chama um erro genérico
                if (depositoMensal <= 0) {
                    throw new Exception();
                }
                // caso um erro aconteça na execução do try, cai nese bloco
            } catch (Exception e) {
                // printa uma mensagem de erro
                System.out.println("Entrada inválida");
                // pula linha para receber o próximo valor
                scan.nextLine();
            }
            // só sai desse loop se receber uma entrada válida
        } while (depositoMensal == null || depositoMensal <= 0);
        // estrutura de repetição do-while para receber o valor do montante desejado com
        // os devidos tratamentos de erros para as entradas inválidas
        do {
            // estrutura try-catch para tratar os erros
            // erros: entradas não numericas, zero e negativas
            try {
                // recebe a entrada e aloca na variável "montanteDesejado"
                System.out.print("Valor do montante desejado: ");
                montanteDesejado = scan.nextDouble();
                // se for 0 ou negativo chama um erro genérico
                if (montanteDesejado <= 0) {
                    throw new Exception();
                }
                // caso um erro aconteça na execução do try, cai nese bloco
            } catch (Exception e) {
                // printa uma mensagem de erro
                System.out.println("Entrada inválida");
                // pula linha para receber o próximo valor
                scan.nextLine();
            }
            // só sai desse loop se receber uma entrada válida
        } while (montanteDesejado == null || montanteDesejado <= 0);
        // declaração das variáveis que serão utilizadas para calcular a quantidade de
        // meses necessários para se atingir o montante desejado a partir da taxa de
        // juros e do depósito mensal
        int numeroDeDepositos = 0;
        double taxaDeJuros = 0.005, montanteFinal = 0;
        // cálculo:
        // calculei o valor do montante acumulado mes a mes
        // cada vez que o cálculo é realizado uma variável contadora é acrescida
        // quando o valor acumulado ultrapassa o valor desejado a estrutura de repetição
        // para e o valor da variável contadora representará o número de depósitos
        // realizados, ou seja, a quantidade de meses necessários
        do {
            numeroDeDepositos++;
            montanteFinal = montanteFinal * (1 + taxaDeJuros) + depositoMensal;
        } while (montanteFinal < montanteDesejado);
        // print do resultado
        System.out.println(
                "Considerando taxa de juros mensais de " + taxaDeJuros * 100 + "%, demorarão " + numeroDeDepositos
                        + " meses para se atingir o montante desejado");
        // fecha a instancia da classe Scanner
        scan.close();
    }
}
```
