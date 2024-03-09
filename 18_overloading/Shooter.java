public class Shooter{
    public static void main(String[] args) {

        Shooter shot = new Shooter();
        shot.shoot(2);

    }
    public String shoot(){
        return "John";
    }
    public void shoot(int count){
        for(int i = 0; i < 10; i++)
        System.out.println("booom!!! " + i);
    }
}
