package LoopsLaçodeRepetição;

import java.util.Scanner;

public class SomaMedia {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        double numero;
        double maior = 0;
        double soma = 0;
        double media;

        int count = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextDouble();

            count++;

            soma = soma + numero;

            if (numero>maior)
                maior = numero;

        } while (count<5);

        media = soma/5;

        System.out.println("O maior número inserido foi: " + maior);
        System.out.println("A média do números inseridos foi: " + media);
    }
}
