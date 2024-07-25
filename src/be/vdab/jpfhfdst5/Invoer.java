package be.vdab.jpfhfdst5;

import java.util.Scanner;

public class Invoer {
    public static void main(String[] args) {
        System.out.print("Geef een getal: ");
        var scanner = new Scanner(System.in);
        var getal = scanner.nextInt();
    }
}
