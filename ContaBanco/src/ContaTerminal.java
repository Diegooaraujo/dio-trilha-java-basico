import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero ;
        String agencia ;
        String nomeCliente ;
        double saldo ;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("POr favor, informe o número da Agencia: ");
        agencia = scanner.next();

        System.out.println("Por favor, informe o número da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, informe o nome do Cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, adicione saldo á Conta: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " +nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo é de "+saldo+" já está disponível para saque");





    }
}
