public class Constructor3 {
    public Constructor3(){
     System.out.println("Running no-args constructor");
    }
    
    public Constructor3(String name, String surname){
     this();
     System.out.println("Running name arg constructor: Name and Surname = "+ name + " " + surname);
    }
    public Constructor3(String name, String surname, String jobDescription){
     this(name, surname);
     System.out.println("Running name arg constructor: Name, Surname and Job Description = "+ name + " " + surname + " " + jobDescription);
    }
}
