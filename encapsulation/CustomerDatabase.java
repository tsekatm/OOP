package OOP.encapsulation;

public class CustomerDatabase{
    private String name;
    private String surname;
    protected int id;


    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
}

