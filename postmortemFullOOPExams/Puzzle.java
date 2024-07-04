java public class Puzzle {
    private static int count = 0;
    
    {
        count++;
    }
    
    static {
        count += 2;
    }
    
    public Puzzle() {
        count++;
    }
    
    public static void main(String[] args) {
        System.out.println(count);
        new Puzzle();
        System.out.println(count);
        new Puzzle();
        System.out.println(count);
    }
}