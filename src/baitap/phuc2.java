package baitap;

import java.util.Scanner;

public class phuc2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase;
        do {
            System.out.println("Nhap mk de dang nhap: ");
            phrase = scanner.next();
        } while (!phrase.equals("DuyTan"));
        {
            System.out.println("Nhap dung mk... ");
        }
    }

}
