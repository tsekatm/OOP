class Game{
	public void play() throws Exception{
		System.out.println("Playing...");
	}
}

public class Soccer extends Game{
	public void play(){
		System.out.println("Playing soccer...");
	}
	public static void main(String[] args) {
		Game g = new Soccer();
		try{
		g.play();
		}

		catch(Exception e){
			System.out.println("Hello");
		}
	}
}