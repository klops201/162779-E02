package Z1;

import java.time.LocalTime;

public class zad1 {
    public static void main(String[] args){

        Integer[] posortowanyInt = {0,2,7,7,2,0};
        ArrayUtill.jestPalindromem(posortowanyInt);

        Integer[] nieposortowanyInt = {0,2,7,2,7,0};
        ArrayUtill.jestPalindromem(nieposortowanyInt);

        LocalTime[] posortowanyLocalTime = {
        LocalTime.of(11,30),
        LocalTime.of(12,40),
        LocalTime.of(13,30),
        LocalTime.of(12,40),
        LocalTime.of(11,30)};
        ArrayUtill.jestPalindromem(posortowanyLocalTime);

        LocalTime[] nieposortowanyLocalTime = {
        LocalTime.of(11,30),
        LocalTime.of(12,20),
        LocalTime.of(13,40),
        LocalTime.of(15,00)};
        ArrayUtill.jestPalindromem(nieposortowanyLocalTime);
        }

    }


    class ArrayUtill{
        public static <T extends Comparable> void jestPalindromem(T[] list){
            boolean czyjest = true;
            for(int i = 0; i < list.length/2; ++i){
                if(!list[i].equals(list[list.length-i-1])){
                    czyjest = false;
                }
            }

            if(czyjest == true){
                System.out.println("jest palindromem");
            }else {
                System.out.println("nie jest palindromem");
            }
        }
    }



