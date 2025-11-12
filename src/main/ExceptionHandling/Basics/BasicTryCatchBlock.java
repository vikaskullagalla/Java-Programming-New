package main.ExceptionHandling.Basics;

public class BasicTryCatchBlock {
    public static void main(String... args){
        try{
            // code that may throw exception
        }
        catch(Exception ex) {
            // code to handle exception
            ex.printStackTrace();
        }
    }
}
