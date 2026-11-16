package chucknorris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String input = scanner.nextLine();
        System.out.println("");
        char[] inputs = input.toCharArray();
        for (Character character : inputs) {
            System.out.print(character + " ");
        }
    }
}