package OOP.gc;

public class GarbageCollection {
    String name;
    GarbageCollection(String paramName){
        name = paramName;
    }

    protected void finalize(){
        System.out.println("Finalizing just before garbage collection");
    }
    
}
