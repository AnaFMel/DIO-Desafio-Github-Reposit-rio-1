package LoopsLaçodeRepetição;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class NomeIdade {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = scan.next();

        System.out.println("Digite a sua idade: ");
        idade = scan.nextInt();

        System.out.println("Aviso: as suas informações serão salvas a partir daqui.");
        System.out.println("Nome inserido: " + nome);
        System.out.println("Idade inserida: " + idade);


    }
}
