package LoopsLaçodeRepetição;

import java.util.Scanner;

public class ParImpar {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de números que deseja inserir: ");
        int quantidadeNumeros = scan.nextInt();

        int quantidadePares = 0;
        int quantidadeImpares = 0;

        int count = 0;

        do {
            System.out.println("Digite o número: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count++;
        } while (count<quantidadeNumeros);

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    }
}
