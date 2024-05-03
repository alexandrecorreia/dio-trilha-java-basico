public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();

        System.out.println("Estado TV ( ligada / desligada ) : " + smartTv.ligada);
        System.out.println("Canal : "  + smartTv.canal);
        System.out.println("Volume : " + smartTv.volume);
        
        smartTv.diminuirVolume();
        System.out.println("Volume : " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Estado TV ( ligada / desligada ) : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Estado TV ( ligada / desligada ) : " + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Canal : "  + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal : " + smartTv.canal);

        smartTv.mudarCanal(5);
        System.out.println("Canal : " + smartTv.canal);


    }

}
