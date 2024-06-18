package postmortem;
final class BigBang extends Bang{
    BigBang(int n){
    	m = n;
    }

    public static void main(String[] args) {
    	Bang mc = new BigBang(5);
    }
    // void h(){}
    void k(){
    	i++;
    }
    void l(){
    	// j++;
    }
    int m;
    public void f(){
    	System.out.println("f method");
    }
}