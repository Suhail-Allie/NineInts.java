package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

 //NineInts
 public static class NineInts {
        public static void main(String[] args) {
            // Array to store 9 integers
            int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

            // Display the integers from first to last
            System.out.println("Numbers from first to last:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println();  // For newline

            // Display the integers from last to first
            System.out.println("Numbers from last to first:");
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
        }
    }



}
