public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        /**
         * byte     1byte   -128 a 127
         * short    2byte   -32.768 a 32.767
         * int      4bytes  -2.147.483.648 a 2.147.483.647
         * long     8bytes  -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
         * float    4bytes   3,4028E+38 a 3,4028E+38 ( precisão de 6-7 dígitos )
         * double   8bytes  -1,7976E+308 a 1,7976E+308 ( precisão de 15 dígitos )
	     */

        int numero = 1;
        final int NUMERO_FIXO = 2;

        System.out.println( numero );
        System.out.println( NUMERO_FIXO );

         
    }
}
