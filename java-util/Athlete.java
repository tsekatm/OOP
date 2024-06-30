import java.util.*;

public class OlympicAthleteRanking{

	String name;
	String country;
	double finishTime;

	public OlympicAthleteRanking(String name, String country, double finishTime){
		this.name = name;
		this.country = country;
		this.finishTime = finishTime;
	}

	public static void main(String[] args) {
		
	List <OlympicAthleteRanking> athleteRanking = new ArrayList<>();

	athleteRanking.add("Tebogo", "South Africa", 19.95);
	athleteRanking.add("Tshepiso", "Botswana", 31.05);
	athleteRanking.add("Denise", "Ghana", 21.05);
	athleteRanking.add("Janine", "USA", 27.05);

	}

    @Override
    public String toString(){
    	return name + "(" + country + ")" + finishTime + "s";
    }



}

