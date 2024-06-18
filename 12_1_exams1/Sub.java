
 
 class Sub extends Base {
    public void methodA(){
        System.out.println("sub - MethodA");
    }
    public void methodB(){
        System.out.println("sub - MethodB");
    }
    public static void main(String[] args) {
        Base b = new Sub();
        b.methodA();
        // b.methodB();//Base class does not have methodB
    }
}
