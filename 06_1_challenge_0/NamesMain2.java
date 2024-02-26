public class NamesMain2{
	public static void main(String[] args) {

		NameGetter2 getter = new NameGetter2();
		AgeGetter2 getter1 = new AgeGetter2();
		SurnameGetter2 getter2 = new SurnameGetter2();

		String name = "Ben";
		String surname = "Khoza";
		int age = 10;
        name = getter.getName(name);
        surname = getter2.getSurname(surname);
        age = getter1.getAge(age);
		System.out.println("Hello " + name + " " + surname + ", you are " + age + " years old");
	}
}