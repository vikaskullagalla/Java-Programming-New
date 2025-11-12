package main.ExceptionHandling.Basics;

import java.util.Scanner;

public class tryWithResourcesExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            Integer number = scanner.nextInt();
            System.out.printf("You Entered: %d", number).println();
        }
        //scanner.close();
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Exception: " + ex.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
