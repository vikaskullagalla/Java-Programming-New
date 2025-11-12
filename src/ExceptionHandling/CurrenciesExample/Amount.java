package ExceptionHandling.CurrenciesExample;

public class Amount {

    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that){
        if(!this.currency.equals(that.currency)){
            throw new RuntimeException("Currencies don't match " + this.currency + " and " + that.currency);
        }
        this.amount += that.amount;
    }

    @Override
    public String toString(){
        return currency + ": " + amount;
    }

}
