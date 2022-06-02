package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class OrdemInversa {
     public static void main (String [] args) {
         int [] vetor = {1,2,3,4,5,6};

         int count = vetor.length - 1;

         System.out.println("Esse vetor em ordem inversa é: ");

         while (count >= 0) {
             System.out.println(vetor[count] + " ");
             count--;
         }

         System.out.println("\n------------");

         System.out.println("Vetor: ");

         for (int elemento : vetor ) {
             System.out.println(elemento + " ");
         }
     }
}
