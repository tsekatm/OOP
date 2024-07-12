public class LabelsInLoops{
    public static void main(String[] args) {
    	
    	int [][] list = {{1,12,5},{1,2,5},{2,7,2}};

    	int searchValue = 2;
    	int positionX = -1;
    	int positionY = -1;

    	PARENT_LOOP: for(int i = 0; i < list.length; i++){
    		for(int j = 0; j < list[i].length; j++){
    			if(list[i][j] == searchValue){
    				positionX = i;
    				positionY = j;
    				break PARENT_LOOP;
    			}
    		}
    	}
    	if(positionY == -1 || positionX == -1){
    		System.out.println("search value not found");
    	}else{
    		System.out.println("search value found at positions "+ positionX + ":" + positionX);
    	}
    }
}