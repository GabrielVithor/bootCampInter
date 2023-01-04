package edu.javaSintaxe.operadores;

public class Operadores {
    /**
     * (=) - atribuição
     * (+) - soma
     * (-) - subtração
     * (*) - multiplicação
     * (/) - divisao
     * (%) - modulo/resto
     * OPERADORES UNARIOS
     * (++) incremento
     * (--) decremento
     * (!) negação
     */

    public static void main(String[] args) {
        //DESCOMENTE A FUNÇÃO A SER EXECUTADA

        //operadoreRelacionais();
        //operadoresAritimeticos();
        //operadoresLogicos();
        //operadoresUnarios();
        //operadorTernario();
    }

    static void operadoresLogicos(){
        //Operadores logicos
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições sao verdadeiras");
        }else if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }else{
            System.out.println("Ambas as condições sao falsas");
        }
    }

    static void operadoreRelacionais(){
        int numero = 1;
        int numero2 = 2;

        boolean simNao = numero2 == numero2;

        System.out.println("Numero1 é igual a numero2 ?" + simNao);

        simNao = numero2 != numero2;

        System.out.println("Numero1 é diferente a numero2 ?" + simNao);

        simNao = numero2 > numero2;

        System.out.println("Numero1 é maior a numero2 ?" + simNao);

        simNao = numero2 < numero2;

        System.out.println("Numero1 é menor a numero2 ?" + simNao);

        simNao = numero2 <= numero2;

        System.out.println("Numero1 é maior ou igual a numero2 ?" + simNao);

        simNao = numero2 <= numero2;

        System.out.println("Numero1 é menor ou igual a numero2 ?" + simNao);

        String nome1 = "Gabriel";
        String nome2 = "Gabriel";

        System.out.println(nome1.equals(nome2));
    }

    static void incrementoDecremento() {
        int numero = 5;
        numero += 2;
        System.out.println(numero); //numero
        System.out.println(++numero); // atribui + 1  e utiliza variavel
        System.out.println(numero++); // utiliza variavel e atribui +1
        System.out.println(numero); // apresenta atribuição anterior
    }

    static void operadorTernario() {
        //Operador ternario

        int a, b;

        a = 5;
        b = 5;
        String resultado = "";
        if (a == b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        String resultadoTernario = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);
        System.out.println(resultadoTernario);
    }

    static void operadoresUnarios() {
        int numero = -5;
        System.out.println(-numero);
        System.out.println(numero);
    }

    static void operadoresAritimeticos() {
        //Exemplo de concatenação

        String nomeCompleto = "Gabriel " + "Mota";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
    }

}
