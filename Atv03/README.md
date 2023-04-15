### Atividade 03
Para a resolução desta atividade realizei os seguinte passos:
1. antes de tudo, realizei o import da biblioteca do JOptionPane
2. dentro do main, primeiramente inicializei uma variável acumuladora com o valor 0
3. realizei 3 try-catch para receber as 2 notas das provas e a nota do trabalho
4. as entradas são acumuladas na variável acumuladora, usando o "+="
5. em caso de erro oa receber a entrada, o sistema fecha (função: System.exit(0))
6. no fim, uma varíavel é declarada e recebe o valor da soma das 3 entradas divido por 3, ou seja, a média
7. o valor da média é mostrado e o programa encerra

- Devido ao problema de compatibilidade, não há arquivo notebook para esta atividade

#### Código:
```
import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        float somaNotas = 0;
        try {
            somaNotas = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da primeira prova: "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        try {
            somaNotas += Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da segunda prova: "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        try {
            somaNotas += Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho: "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        float media = somaNotas / 3;
        JOptionPane.showMessageDialog(null, "A média é = " + media,
                "RESULTADO", JOptionPane.PLAIN_MESSAGE);
    }
}
```
