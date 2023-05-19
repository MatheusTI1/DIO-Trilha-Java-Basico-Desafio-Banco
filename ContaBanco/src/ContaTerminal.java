import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência !");
        String numeroAgencia = scanner.next();  
        scanner.nextLine(); // Este foi o meu maior desafio no projeto atual, ao executar este comando "scanner.nextLine()" o interpretador pulava a linha e não permitia a entrada de dados do usuário, utilizar o "scanner.next()" não permitiria que o usuario entrasse com seu nome composto exemplo : "MARIO ANDRADE", ao pesquisar me deparei com o seguinte artigo "https://pt.stackoverflow.com/questions/507845/uso-do-nextline-em-java" e consegui resolver o problema em questão.

        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, Digite seu saldo !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
