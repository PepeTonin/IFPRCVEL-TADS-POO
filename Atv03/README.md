### Atividade 03
Para a resolução desta atividade realizei os sguinte passos:


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
        JOptionPane.showMessageDialog(null, "Média dos numeros digitados = " + media,
                "RESULTADO", JOptionPane.PLAIN_MESSAGE);
    }
}
```
