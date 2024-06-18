public class ConstC extends ConstB{
    public ConstC(){
        this("Tebogo");
        System.out.println("ConstC no args constructor");
    }
    public ConstC(String name){
     super(name,"Smith");
     System.out.println("Class C:"+name);
    }   
}




