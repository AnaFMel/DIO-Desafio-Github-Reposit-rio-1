package ExercíciosInterfaceList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PerguntasCrime {
    public static void main (String [] args) {
        List<String> Respostas = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Questionário: ");

        System.out.println("Telefonou para a vítima? ");
        String Resposta = scan.next();
        Respostas.add(Resposta);

        System.out.println("Esteve no local do crime? ");
        Resposta = scan.next();
        Respostas.add(Resposta);

        System.out.println("Mora perto da vítima? ");
        Resposta = scan.next();
        Respostas.add(Resposta);

        System.out.println("Devia para a vítima? ");
        Resposta = scan.next();
        Respostas.add(Resposta);

        System.out.println("Já trabalhou com a vítima?");
        Resposta = scan.next();
        Respostas.add(Resposta);

        int sim = 0;
        Iterator<String> contador = Respostas.iterator();
        while (contador.hasNext()){
            String resposta = contador.next();
            if (resposta.contains("sim")){
                sim++;
            }
        }
        switch (sim){
            case (0):
            case (1):
                System.out.println("Você foi classificado como inocente.");
                break;
            case (2):
                System.out.println("Você foi classificado como suspeito(a).");
                break;
            case (3):
            case (4):
                System.out.println("Você foi classificado como cúmplice.");
                break;
            case (5):
                System.out.println("Você foi classificado como o(a) assassino(a).");
                break;
        }

    }
}
