### Atividade 01
Para a resolução desta atividade realizei os sguinte passos:
1. import da biblioteca Scanner da java.util
2. dentro da classe main declarei e inicializei duas variaveis do tipo double que serão usadas para resolver a atividade
3. instanciei um objeto da classe Scanner
4. usei uma estrutura de repetição do tipo 'do while'
5. dentro do loop usei um 'try-catch' para tratar erros genericos
6. printei o texto auxiliar para o usuario
7. usei o objeto Scanner para receber esse valor digitado do usuario
8. o valor digitado pelo usuario é acumulado na variavel acumuladora denominada 'soma'
9. caso ocorra algum erro, usuario digitar algo não numério, por exemplo, cai no catch
10. no catch o método 'nextLine' da classe Scanner faz com uma linha seja pulada, deixando o objeto pronto para receber a próxima entrada normalmente
11. ao final, a soma dos valores é mostrada na tela e a instancia da classe Scanner é fechada
* a estrutura de repetição se encerra quando o usuário digita 0

#### Código:
```
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double entrada = -1, soma = 0;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.print("Digite um numero para somar ou 0 se quiser visualizar a soma dos ja digitados: ");
                entrada = scan.nextDouble();
                soma += entrada;
            } catch (Exception e) {
                scan.nextLine();
            }
        } while (entrada != 0);
        System.out.printf("a soma é %f", soma);
        scan.close();
    }
}
```
