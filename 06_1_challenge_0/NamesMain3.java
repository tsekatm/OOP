
public class NamesMain4{
	public static void main(String[] args) {

		AgeGetter3 getter = new AgeGetter3();
		NameGetter3 getter1 = new NameGetter3();
		SurnameGetter3 getter2 = new SurnameGetter3();

		String name;
		String surname;
		int age;

        name = getter1.getName();
        surname  = getter2.getSurname();
        age = getter.getAge();
		System.out.println("Hello " + name + " " + surname + ", you are " + age + " years old");
	}
}