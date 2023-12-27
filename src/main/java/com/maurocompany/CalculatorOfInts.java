package com.maurocompany;

public class CalculatorOfInts {
    public int sumAndPrint(int na, int nb){
        int result = na+nb;
        String messageOfSum = "El resultado de la suma es: ";
        System.out.println(messageOfSum);
        System.out.println(result);
        return result;
    }
}
