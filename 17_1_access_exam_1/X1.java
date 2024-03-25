interface X1 {
}
interface X2{}
class A{
    public void doSomething(){
        System.out.println("Class A method");
    }
}
class B extends A implements X1{}
class C extends B implements X2{
    D d = new D();
}
class D{}
