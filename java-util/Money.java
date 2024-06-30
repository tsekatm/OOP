import java.util.*;

public class Money implements Comparable<Money>{
	public Money(Currency currency, double value){
		this.currency = currency;
		this.value = value;
	}
	public static void main(String[] args) {

		List<Money> currencyList = new ArrayList<>();

		currencyList.add(new Money(Currency.GBP, 5));
		currencyList.add(new Money(Currency.USD, 10));
		currencyList.add(new Money(Currency.EUR, 100));
		currencyList.add(new Money(Currency.ZAR, 1000));
		currencyList.add(new Money(Currency.AED, 100));

		Collections.sort(currencyList);
		System.out.println("Ascending order: "+currencyList);
		Collections.reverse(currencyList);
		System.out.println("Descending order" + currencyList);

		

		
		
	}
    private Currency currency;
    private double value;

    public Money(){

    }

    
    @Override
    public String toString(){
    	return String.format("%.2f %s", value, currency);
    }

    @Override
    public int compareTo(Money other){
    	if(this.value > other.value){
    		return 1;
    	}
    	else if (this.value < other.value) {
    		return -1;
    	}
    	else{
    		return 0;
    	}
    	
    }
}

enum Currency{

	USD,EUR,ZAR,GBP, AED
}
