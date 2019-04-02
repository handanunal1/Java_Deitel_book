package exercises.e13;

public class Cube extends ThreeDimensionalShape{

	int height;
	
	

	public Cube(int height) {
		super();
		this.height = height;
	}

	
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return getHeight()*getHeight()*getHeight();
	}
	
	
}
