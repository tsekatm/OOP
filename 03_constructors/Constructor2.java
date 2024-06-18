public class Constructor2 {
    public Constructor2(){
        System.out.println("New constructor");
    }
    public Constructor2(String name) {
        this();
        System.out.println("Constructing Name:"+name);
    }
}


