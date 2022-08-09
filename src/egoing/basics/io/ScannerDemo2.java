package egoing.basics.io;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt() * 3000);
        }

        sc.close();
     }
}
