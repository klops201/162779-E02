package Z2;

import java.util.ArrayList;

public class zadanie2 {
    public static void main(String[] args){
        ArrayList<Integer> Inty = new ArrayList<>();
        Inty.add(0);
        Inty.add(1);
        Inty.add(2);
        Inty.add(3);
        Inty.add(4);
        Inty.add(5);
        wypiszCoDrugi(Inty);

        ArrayList<String> Stringi = new ArrayList<>();
        Stringi.add("a");
        Stringi.add("b");
        Stringi.add("c");
        Stringi.add("d");
        Stringi.add("e");
        Stringi.add("f");
        wypiszCoDrugi(Stringi);

    }


    public static <T extends Iterable<E>, E> void wypiszCoDrugi(T list){
        int x = 0;
        for(E i:list){
            if(x%2==0){
                System.out.println(i + ", ");
            }
            x++;
        }
        System.out.println("\n");
    }
}




