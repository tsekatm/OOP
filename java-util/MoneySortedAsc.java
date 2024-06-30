import java.util.*;

public class Money implements Comparable<Money>{
	public Money(Currency currency, double value){
		this.currency = currency;
		this.value = value;
	}
	public static void main(String[] args) {

		List<Money> money = new ArrayList<>();
		money.add(new Money(Currency.USD, 10));
		money.add(new Money(Currency.EUR, 100));
		money.add(new Money(Currency.ZAR, 1000));
		money.add(new Money(Currency.GBP, 5));
		
        Collections.sort(money);
		System.out.println(money);
		
		
	}
    private Currency currency;
    private double value;

    public Money(){

    }

    public Currency getCurrency(){
    	return currency;
    }
    public void setCurrency(Currency currency){
        this.currency = currency;
    }

    public double getValue(){
    	return value;
    }

    public void setValue(double value){
    	this.value = value;
    }
    @Override
    public String toString(){
    	return String.format("%.2f %s", value, currency);
    }
    @Override
    public int compareTo(Money other){
    	return Double.compare(this.value, other.value);
    }
}

enum Currency{

	USD,
	EUR,
	ZAR,
	GBP
}