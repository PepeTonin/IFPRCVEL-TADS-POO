### Atividade 02
Para a resolução desta atividade realizei os sguinte passos:
1. import da biblioteca Scanner da java.util
2. dentro da classe main instanciei um objeto da classe Scanner
3. exibe a mensagem solicitada
4. recebe um inteiro do usuario e atribui para a variável b
5. exibe novamente a mensagem
6. recebe um inteiro do usuario e atribui para a variável c
7. atribui o produto das variaveis b e c para a variavel a
8. exibe o resultado com um texto auxiliar demonstrando a execução do calculo
9. comentario afirmando que é um programa de exemplo de fohla de pagamento

#### Código:
```
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um inteiro: ");
        int b = scan.nextInt();
        System.out.print("Informe um inteiro: ");
        int c = scan.nextInt();
        int a = b * c;
        System.out.printf("O resultado da operação %d x %d é %d", b, c, a);
        scan.close();
        // programa executa um cálculo de exemplo de folha de pagamento
    }
}
```