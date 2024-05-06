public class Argumentos {

    public static void main(String[] args) throws Exception {

        String nome = args[0];
        String sobrenome = args[1];

        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Nome " + nome);
        System.out.println("SobrNome " + sobrenome);
        System.out.println("Idade : " + idade );
        System.out.println("Altura : " + altura );

    }

}
