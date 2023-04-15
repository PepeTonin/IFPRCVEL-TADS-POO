### Atividade 04
Para a resolução desta atividade realizei os seguinte passos:
1. 3 variáveis do tipo real foram declaradas e inicializadas com os valores descritos no enunciado da atividade
2. variável "gastosTrimestre" foi declarada e inicializada com valor da soma das outras 3
3. essa última variável foi mostrada usando "System.out.println()"


#### Código:
```
public class BalancoTrimestral {
    public static void main(String[] args) {
        double gastosJaneiro = 30000;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println(gastosTrimestre);
    }
}
```