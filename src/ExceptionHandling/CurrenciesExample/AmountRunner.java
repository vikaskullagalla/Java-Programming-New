package ExceptionHandling.CurrenciesExample;

public class AmountRunner {
    public static void main(String[] args){
        Amount amount1 = new Amount("USD",10);
        Amount amount2 = new Amount("EUR", 15);
        //Amount amount2 = new Amount("USD", 15);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}


//SELECT *
//FROM employees
//WHERE salary = (SELECT MAX(salary) FROM employees);
//
//SELECT *
//FROM employees
//ORDER BY salary DESC
//LIMIT 1;