enum ABC{
	ABC;

	int i = 1;

	{
		i++;
	}

	{
		++i;
	}

	private ABC(){
		i = i++ + ++i;
	}
}

public class MainClass26{
	public static void main(String[] args) {
		System.out.println(ABC.ABC.i);
	}
}