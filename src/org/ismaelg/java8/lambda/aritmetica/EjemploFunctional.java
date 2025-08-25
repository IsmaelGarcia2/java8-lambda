package org.ismaelg.java8.lambda.aritmetica;

public class EjemploFunctional {
    public static void main(String[] args) {

        Aritmetica suma = (a, b) -> a+b;
        Aritmetica resta = (a, b) -> a-b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10,5,suma));
        System.out.println(cal.computar(10,5,resta));


        System.out.println(cal.computar(10,5,(a, b) -> a *b));

        System.out.println(cal.computarConBi(10,5,(a,b) -> a +b));
    }


}
