import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência !");
        String numeroAgencia = scanner.next();  
        scanner.nextLine(); // Consumindo linha

        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, Digite seu saldo !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
