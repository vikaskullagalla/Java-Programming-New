package main.ExceptionHandling.Basics;

import java.util.ConcurrentModificationException;

import java.util.*;

public class MultipleCatch {
    public static void main(String... args) {
        try {
            // 1. NullPointerException
            String str = null;
            // Uncomment to throw NullPointerException
            // System.out.println(str.length());

            // 2. ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            // Uncomment to throw ArrayIndexOutOfBoundsException
            // System.out.println(numbers[5]);

            // 3. ArithmeticException
            // Uncomment to throw ArithmeticException
            // int result = 10 / 0;

            // 4. StringIndexOutOfBoundsException
            String text = "Hello";
            // Uncomment to throw StringIndexOutOfBoundsException
            // char ch = text.charAt(10);

            // 5. IllegalArgumentException
            // Uncomment to throw IllegalArgumentException
            // Thread.currentThread().setPriority(11);

            // 6. IllegalStateException
            List<String> list = new ArrayList<>();
            list.add("One");
            Iterator<String> it = list.iterator();
            it.next();
            // Uncomment to throw IllegalStateException
            //it.remove(); it.remove();

            // 7. UnsupportedOperationException
            List<String> unmodifiable = Collections.unmodifiableList(new ArrayList<>());
            // Uncomment to throw UnsupportedOperationException
            // unmodifiable.add("test");

            // 8. ClassCastException
            Object obj = "Hello";
            // Uncomment to throw ClassCastException
            // Integer number = (Integer) obj;

            // 9. ConcurrentModificationException
            List<String> myList = new ArrayList<>(Arrays.asList("a", "b", "c"));
            // This will throw ConcurrentModificationException
            /*
            for (String s : myList) {
                if (s.equals("a")) {  // Changed from "b" to "a" to ensure exception
                    myList.add("new element");  // Modifying list while iterating
                }
            }
            */

            // 10. NumberFormatException (replacing SecurityException for demonstration)
            // This will throw NumberFormatException
            String notANumber = "abc123";
            int number = Integer.parseInt(notANumber);

            System.out.println("No exceptions occurred!");
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (ArithmeticException ex) {
            System.out.println("ArithmeticException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (StringIndexOutOfBoundsException ex) {
            System.out.println("StringIndexOutOfBoundsException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (NumberFormatException ex) {
            System.out.println("NumberFormatException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (IllegalStateException ex) {
            System.out.println("IllegalStateException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (UnsupportedOperationException ex) {
            System.out.println("UnsupportedOperationException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (ClassCastException ex) {
            System.out.println("ClassCastException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (ConcurrentModificationException ex) {
            System.out.println("ConcurrentModificationException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
                catch (Exception ex) {
            System.out.println("Unexpected exception occurred: " + ex.getClass().getName() + ": " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
