package ExceptionHandling.Basics;

import java.util.Scanner;

public class tryCatchScanner {
    public static void main(String[] args){
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            if(scanner != null){
                scanner.close();
            }
        }
    }
}
