public class Operadores {
    public static void main(String[] args) {
     
        /**
         * Operador de atribuicao '='
         */

        String nome = "Alexandre";
        int idade = 100;
        char sexo = 'M';
        
        System.out.print(nome);

        /**
         * Operadores aritmeticos + - * / %
         */

        System.out.println( 18 % 3 );
        System.out.println( ( 10 * 7 ) + (20/4) );

        //idade++;
        System.out.println(idade++);
        System.out.println(idade);
        idade = idade * -1;
        System.out.println( idade);
        idade = idade--;
        System.out.println( idade );


        System.out.println( idade > 100 ? "Maior" : "Menor" );

        idade++;

        /* Relacionais */
        System.out.println( " 1 " + ( idade == 100 ? "SIm" : "Nao" ) );
        idade++;
        System.out.println( " 2 " + ( idade != 100 ? "SIm" : "Nao" ) );
        idade--;
        System.out.println( " 3 " + ( idade > 100 ? "SIm" : "Nao" ) );
        idade--;
        System.out.println( " 4 " + ( idade < 100 ? "SIm" : "Nao" ) );
        idade++;
        System.out.println( " 5 " + ( idade >= 100 ? "SIm" : "Nao" ) );
        idade++;
        System.out.println( " 6 " + ( idade <= 100 ? "SIm" : "Nao" ));

    }
}
