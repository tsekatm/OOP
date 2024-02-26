public class NamesMain2{
	public static void main(String[] args) {

		AgeGetter2 getter = new AgeGetter2();

		String name = "Ben";
		String surname = "Khoza";
		int age = 10;
        name = getter.getName(name);
        surname = getter.getSurname(surname);
        age = getter.getAge(age);
		System.out.println("Hello " + name + " " + surname + ", you are " + age + " years old");
	}
}