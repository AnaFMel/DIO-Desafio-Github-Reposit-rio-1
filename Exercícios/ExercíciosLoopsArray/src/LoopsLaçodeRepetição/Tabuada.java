package LoopsLaçodeRepetição;

import java.util.Scanner;

public class Tabuada {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();


        System.out.println("A tabuada de " + numero + " é:");
         for (int i = 1;i <= 10; i++) {

             System.out.println(numero + " x " + i + " = " + (numero*i));
         }





    }
}
