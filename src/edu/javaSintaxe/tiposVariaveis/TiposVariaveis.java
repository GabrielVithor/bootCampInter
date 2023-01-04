package edu.javaSintaxe.tiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2.5; //2,5 no formato brasileiro
        double salarioAutal = 2500; //2.500 no formato brasileiro


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroCurto;

        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);

    }
}
