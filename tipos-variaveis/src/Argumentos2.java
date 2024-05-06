import java.util.Locale;
import java.util.Scanner;

public class Argumentos2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Altura");
        double altura = scanner.nextDouble();

        System.out.println("idade");
        int idade = scanner.nextInt();

        System.out.println("nome");
        String nome = scanner.next();

        System.out.println("sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Nome " + nome);
        System.out.println("SobrNome " + sobrenome);
        System.out.println("Idade : " + idade );
        System.out.println("Altura : " + altura );

    }
}
