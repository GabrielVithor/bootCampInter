package edu.javaSintaxe.metodos;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Canal atual "+canal);
    }

    void aumentarCanal(){
        canal++;
        System.out.println("Canal atual "+canal);
    }

    void diminuirCanal(){
        canal--;
        System.out.println("Canal atual "+canal);

    }

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void aumentarVolume(){
        volume++;
        System.out.println("Volume atual "+volume);
    }

    void abaixarVolume(){
        volume--;
        System.out.println("Volume atual "+volume);
    }

}
