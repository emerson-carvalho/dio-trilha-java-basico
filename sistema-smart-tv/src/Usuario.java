public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanar(11);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

    }
}
