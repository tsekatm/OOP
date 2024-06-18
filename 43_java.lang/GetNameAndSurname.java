public class GetNameAndSurname{
	public static void main(String[] args) {
		String str = "Tebogo#Mabel#Tseka";
		System.out.println(str.startsWith("tebogo"));
		System.out.println(str.contains("Tebogo"));
		System.out.println(str.contains("Tseka"));
		System.out.println(str.equals("tebogo#Mabel#Tseka"));
		System.out.println(str.equalsIgnoreCase("tebogo#Mabel#Tseka"));
		System.out.println(str.length());
		System.out.print(str.substring(0,6));
		System.out.print(str.substring(7,12));
		System.out.print(str.substring(13,18));

	}
}