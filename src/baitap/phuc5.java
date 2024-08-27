package baitap;

import java.util.Random;

public class phuc5 {

    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(3);
        if (r == 0) {
            System.out.println(" Keo %= ");
        } else if (r == 1) {
            System.out.println(" Bua 0-- ");
        } else if (r == 2) {
            System.out.println(" Bao * ");
        }

    }

}
