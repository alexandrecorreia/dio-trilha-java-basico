import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuario
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o numero da AGENCIA : ");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite a AGENCIA : ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o NOME do cliente : ");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite o saldo do cliente : ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}

