package ExercíciosInterfaceSet;

import java.util.*;


public class ArcoÍris {
    public static void main(String[] args) {
        LinkedHashSet<String> coresArcoIris = new LinkedHashSet<>();
        coresArcoIris.add("vermelho");
        coresArcoIris.add("laranja");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("verde");
        coresArcoIris.add("azul claro");
        coresArcoIris.add("azul escuro");
        coresArcoIris.add("roxo");


        System.out.println("Cores do arco-íris uma abaixo da outra: ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            System.out.println(cor);
        }

        System.out.println("Quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        TreeSet<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println("As cores do arco-íris em ordem alfabetica são: " + coresArcoIris2);


        List<String> coresArcoIris3 = new ArrayList<>(coresArcoIris);
        Collections.reverse(coresArcoIris3);
        System.out.println("As cores na ordem inversa da que foram inseridas são: ");
        System.out.println(coresArcoIris3);


        System.out.println("Todas as cores que começam com a letra v são: ");
        Iterator<String> umPorUm = coresArcoIris.iterator();
        while (umPorUm.hasNext()) {
            String cor = umPorUm.next();
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

        System.out.println("Conjunto com a remoção de todas as cores que não começam com a letra v: ");
        umPorUm = coresArcoIris.iterator();
        while (umPorUm.hasNext()) {
            String cor = umPorUm.next();
            if (!cor.startsWith("v")) {
                umPorUm.remove();
            }
        }
        System.out.println(coresArcoIris);

        System.out.println("O conjunto limpo: ");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("Confirmação de que o conjunto está limpo: " + coresArcoIris.isEmpty());

    }


}



