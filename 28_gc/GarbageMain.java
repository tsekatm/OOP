package OOP.gc;

public class GarbageMain {
    public static void main(String[] args) {
        GarbageCollection garbage1 = new GarbageCollection("Garbage1");
        GarbageCollection garbage2 = new GarbageCollection("Garbage2");
        GarbageCollection garbage3 = new GarbageCollection("Garbage3");
        GarbageCollection garbage4 = new GarbageCollection("Garbage4");
        GarbageCollection garbage5 = new GarbageCollection("Garbage5");
        GarbageCollection garbage6 = new GarbageCollection("Garbage6");
        GarbageCollection garbage7 = new GarbageCollection("Garbage7");
        GarbageCollection garbage8 = new GarbageCollection("Garbage8");
        GarbageCollection garbage9 = new GarbageCollection("Garbage9");
        GarbageCollection garbage10 = new GarbageCollection("Garbage10");

        garbage1.finalize();
        garbage2.finalize();
        garbage3.finalize();
        garbage4.finalize();
        garbage5.finalize();
        System.gc();
        garbage6.finalize();
        garbage7.finalize();
        garbage8.finalize();
        garbage9.finalize();
        garbage10.finalize();
        System.gc();
    }    
}
