package ExceptionHandling.Basics;

public class tryCatchFinally {
    public static void main(String... args){
        try{
            //code that may throw exception
        }
        catch(Exception ex){
            //code to handle exception
            ex.printStackTrace();
        }
        finally{
            // optional
            // this code will be executed regardless exception is thrown or not
        }
    }
}
