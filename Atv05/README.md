### Atividade 05
Para a resolução desta atividade realizei os seguinte passos:
1. a partir do código do exercício 4
2. primeiramente, foi adicionado a linha em que a variável "mediaMensal" é delcarada e inicializada com o valor da media de gastos mensais (valor gasto no trimestre dividido por 3)
3. em seguida, essa variável é printada usando o método "System.out.println()"

#### Código:
```
public class Ex5 {
    public static void main(String[] args) {
        double gastosJaneiro = 30000;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println(gastosTrimestre);

        double mediaMensal = gastosTrimestre / 3;
        System.out.println("Valor da média mensal = " + mediaMensal);
    }
}
```
