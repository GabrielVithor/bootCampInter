package edu.javaSintaxe.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada "+smartTv.ligada);
        System.out.println("Canal atual "+smartTv.canal);
        System.out.println("Volume "+ smartTv.volume);

        smartTv.ligar();

        System.out.println("Smart Tv novo status "+smartTv.ligada);

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();

        smartTv.aumentarVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        smartTv.diminuirCanal();

        smartTv.mudarCanal(10);

    }
}
