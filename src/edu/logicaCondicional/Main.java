package edu.logicaCondicional;

public class Main {

    public static void main(String args[]){
        //operadoresRelacionais();
        operadoresLogicos();
    }

    private static void operadoresRelacionais() {
        char c1 = 'a',c2 = 'b';
        int i1 = 1, i2 = 2;
        float f1 = 1f,f2 = 2f;
        boolean b1 = false, b2 =true;
        String s1 = "gabriel", s2 = "mota";

        System.out.println("\nINTEIROS\n");

        System.out.println("i1 == i2"+ (i1 == i2));
        System.out.println("i1 != i2"+ (i1 != i2));
        System.out.println("i1 >= i2"+ (i1 >= i2));
        System.out.println("i1 < i2"+ (i1 < i2));

        System.out.println("\nFLOATS\n");
        System.out.println("f1 < f2"+ (f1 < f2));
        System.out.println("f1 == f2"+ (f1 == f2));
        System.out.println("f1 >= f2"+ (f1 >= f2));
        System.out.println("f1 != f2"+ (f1 != f2));

        System.out.println("\nBOOLEANS\n");
        System.out.println("b1 == b2"+(b1==b2));
        System.out.println("b1 != b2"+(b1!=b2));

        System.out.println("\nCHARS\n");
        System.out.println("c1 != c2"+(c1 != c2));
        System.out.println("c1 == c2"+(c1 == c2));
        System.out.println("c1 >= c2"+(c1 >= c2));
        System.out.println("c1 < c2"+(c1 < c2));

        System.out.println("\nSTRINGS\n");
        System.out.println("s1 == s2"+(s1 == s2));
        System.out.println("s1 != s2"+(s1 != s2));

        System.out.println("\nNUMERICOS\n");
        System.out.println("i1 == f1"+(i1 == f1));
        System.out.println("i1 != f1"+(i1 != f1));
        System.out.println("i1 >= f1"+(i1 >= f1));
        System.out.println("i1 < f1"+(i1 < f1));
    }

    public static void operadoresLogicos(){
        boolean b1=true,b3 = true,b2=false,b4 = false;

        System.out.println("b1 && b2"+(b1&&b2));
        System.out.println("b1 && b3"+(b1&&b3));
        System.out.println("b1 && b4"+(b1&&b4));
        System.out.println("b2 && b3"+(b1&&b4));
        System.out.println("b2 && b4"+(b2&&b4));


        System.out.println("b1 || b2"+(b1||b2));
        System.out.println("b1 || b3"+(b1||b3));
        System.out.println("b1 || b4"+(b1||b4));
        System.out.println("b2 || b3"+(b1||b4));
        System.out.println("b2 || b4"+(b2||b4));

        int i1 = 10,i2 =5;
        float f1= 20f,f2 = 50f;

        System.out.println("((i1+ i2) <(f2 - f1)) && true ->"+(((i1+i2) < (f2-f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1)) -> "+((i1>i2)||(f2<f1)));

        double salarioMensal = 11893.58d,mediaSalario = 10500.0d;
        int quantidadeDependentes = 4,mediaDependentes = 2;

        boolean baixoSalario = (salarioMensal < mediaSalario),muitosDependentes = (quantidadeDependentes > mediaDependentes);
        boolean adquirirBeneficio = baixoSalario && muitosDependentes;
        System.out.println(adquirirBeneficio);



    }

}
