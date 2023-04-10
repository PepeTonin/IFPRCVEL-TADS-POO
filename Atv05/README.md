### Atividade 05
Para a resolução desta atividade realizei os sguinte passos:


#### Código:
```
public class Ex5 {
    public static void main(String[] args) {
        int gastosJaneiro = 30000;
        float gastosFevereiro = (float) 33030.77;
        float gastosMarco = (float) 23899.01;
        float gastosTrimestre = (float) gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.printf("Gasto trimestral = R$%.2f\n", gastosTrimestre);
        float mediaMensal = (float) gastosTrimestre / 3;
        System.out.printf("Valor da média mensal = R$%.2f", mediaMensal);
    }
}
```
