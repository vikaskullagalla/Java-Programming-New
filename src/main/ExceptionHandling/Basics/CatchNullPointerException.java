package main.ExceptionHandling.Basics;

public class CatchNullPointerException {
    public static void main(String... args){
        try{
            String str = null;
            str.length();
        }
        catch(NullPointerException ex){
           // System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
