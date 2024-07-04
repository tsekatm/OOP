interface Process{
	public void process(int a, int b);
}
public class Data{
	int value;
	Data(int value){
		this.value = value;
	}

	public static void main(String[] args) {
		ArrayList<Data> al = new ArrayList<Data>();
        al.add(new Data(1));
        al.add(new Data(2));
        al.add(new Data(3));
        processList(al,(int a, int b) -> System.out.println(a*b));
	}
}

public void processList(ArrayList<Data> dataList, Process p){
	for(Data d: dataList){
		p.process(d.value);
	}
}



