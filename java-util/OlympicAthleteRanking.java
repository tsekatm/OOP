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
		
	List <OlympicAthleteRanking> athlete = new ArrayList<>();

	athlete.add(new OlympicAthleteRanking("Tebogo", "South Africa", 19.95));
	athlete.add(new OlympicAthleteRanking("Tshepiso", "Botswana", 31.05));
	athlete.add(new OlympicAthleteRanking("Denise", "Ghana", 21.05));
	athlete.add(new OlympicAthleteRanking("Janine", "USA", 27.05));

	Comparator <OlympicAthleteRanking> finishTimeComparator = new Comparator<OlympicAthleteRanking>(){
    @Override

        public int compare(OlympicAthleteRanking a1, OlympicAthleteRanking a2){
    	     return Double.compare(a1.finishTime, a2.finishTime);
        }

    };


    Collections.sort(athlete, finishTimeComparator);

        System.out.println("Olympic 100m Rankings:");
        for(int i = 0; i < athlete.size(); i++){
    	    System.out.println((i + 1) + ". " + athlete.get(i));
        }
	}

    @Override
    public String toString(){
    	return name + "(" + country + ")" + finishTime + "s";
    }
    

}

