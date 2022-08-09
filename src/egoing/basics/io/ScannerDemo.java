package egoing.basics.io;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input : ");
        int i = sc.nextInt();
        System.out.println(i * 1000);
        sc.close();
    }
}
