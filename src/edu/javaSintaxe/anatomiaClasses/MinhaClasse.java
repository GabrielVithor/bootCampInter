package edu.javaSintaxe.anatomiaClasses;

public class MinhaClasse {
    public static void main(String[] args) {
        String meuNome = "Gabriel";
        int anoFabricacao = 2022;
        boolean verdadeira = true;
        anoFabricacao = 2018;
        System.out.println(nomeComleto("Gabriel","Mota"));
    }

    static String nomeComleto(String primeiroNome, String segundoNome){
        return (primeiroNome + " " + segundoNome);
    }


}
