package ExceptionHandling.Basics;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String... args){
        try {
            int[] arr = new int[5];
            arr[10] = 10;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("Exception: " + ex.getMessage());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
