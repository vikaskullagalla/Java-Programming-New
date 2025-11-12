package main.ExceptionHandling.Basics;

public class NullPointerExceptionTryCatch {
    public static void main(String[] args){
        try{
            String str = null;
            str.length();
        }
        catch(Exception ex){
            ex.printStackTrace();
           // System.out.println("Exception: " + ex.getMessage());
        }
    }
}
