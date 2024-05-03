public enum MyEnum23{
	CONSTANT1(1,1),
	CONSTANT2(2,2),
	CONSTANT3(3,3);
	private int height;
	private int width;
	MyEnum23(int height, int width){
		this.height = height;
		this.width = width;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
}