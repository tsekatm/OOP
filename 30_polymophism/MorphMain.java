package OOP.polymophism;

public class MorphMain {
    public static void main(String[] args) {
        Morph1 morph1 = new Morph1();
        Object target = null;
        target = morph1;
        target = (Object) morph1;
    }
    
}
