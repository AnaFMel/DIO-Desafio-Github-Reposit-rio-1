package ExercíciosInterfaceList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MediaTemperaturas {
    public static void main (String [] args){
        List<Double> TEMPERATURAS = new ArrayList<Double>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a temperatura média de Janeiro :");
        double temperatura = scan.nextDouble();
        TEMPERATURAS.add(temperatura);
        System.out.println("Insira a temperatura média de Fevereiro :");
        temperatura = scan.nextDouble();
        TEMPERATURAS.add(temperatura);
        System.out.println("Insira a temperatura média de Março:");
        temperatura = scan.nextDouble();
        TEMPERATURAS.add(temperatura);
        System.out.println("Insira a temperatura média de Abril:");
        temperatura = scan.nextDouble();
        TEMPERATURAS.add(temperatura);
        System.out.println("Insira a temperatura média de Maio:");
        temperatura = scan.nextDouble();
        TEMPERATURAS.add(temperatura);
        System.out.println("Insira a temperatura média de Junho:");
        temperatura = scan.nextDouble();
        TEMPERATURAS.add(temperatura);

        double somaSemestral = 0d;

        Iterator<Double> iterator = TEMPERATURAS.iterator();
        while (iterator.hasNext()){
           Double próximo = iterator.next();
           somaSemestral += próximo;
        }
        double mediaSemestral = somaSemestral/6;

        System.out.println("A média semestral dessas temperaturas é: " + mediaSemestral);

        System.out.println("As médias mensais acima dessa média semestral são: ");

        int posição  = 0;

        Iterator<Double> acima = TEMPERATURAS.iterator();
        while (acima.hasNext()){
            Double temperaturasAcima = acima.next();
            if (temperaturasAcima > mediaSemestral){
                switch(posição){
                    case (0):
                        System.out.println("Janeiro : " + temperaturasAcima);
                        break;
                    case (1):
                        System.out.println("Fevereiro: " + temperaturasAcima);
                        break;
                    case (2):
                        System.out.println("Março : " + temperaturasAcima);
                        break;
                    case (3):
                        System.out.println("Abril : " + temperaturasAcima);
                        break;
                    case (4):
                        System.out.println("Maio : " + temperaturasAcima);
                        break;
                    case (5):
                        System.out.println("Junho : " + temperaturasAcima);
                        break;
                }
            }
            posição++;
        }

        }
}
