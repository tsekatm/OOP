import java.util.*;

public class Data{
	int value;
	Data(int value){
		this.value = value;
	}
	public String toString(){
		return "" +value;
	}

	public static void main(String[] args) {
		Data[] dataArr = new Data[]{new Data(1),new Data(2),new Data(3),new Data(4)};
		List<Data> dataList = Arrays.asList(dataArr);
		for(Data element : dataList){
			dataList.removeIf((Data d) -> {
				return d.value%2 == 0;
			});
			// System.out.println("Removed " + d + ", ");
		}	
    }
}