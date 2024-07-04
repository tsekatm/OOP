public interface I1{}
interface I2{}
class C1 implements I1{}
class C2 implements I2{}
class C3 extends C1 implements I2{}
public static void main(String[] args) {
	C1 o1 = new C1();
C2 o2 = new C2();
C3 o3 = new C3();
}
