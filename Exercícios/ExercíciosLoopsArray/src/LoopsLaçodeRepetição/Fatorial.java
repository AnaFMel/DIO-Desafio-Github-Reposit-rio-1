package LoopsLaçodeRepetição;

import java.util.Scanner;

public class Fatorial {

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        int multiplicaçao = 1;
        int i = numero;

        do {
           multiplicaçao = multiplicaçao * i;
           i--;
        }
        while (i >= 1);

        System.out.println("O fatorial desse número é:" + numero + " != " + multiplicaçao );
    }

}
