package chucknorris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String input = scanner.nextLine();
        System.out.println("\nThe result:");
        for (char s : input.toCharArray()) {
            String binario = String.format("%7s", Integer.toBinaryString(s)).replace(' ', '0');

            System.out.println(s + " = " + binario);
        }
    }
}