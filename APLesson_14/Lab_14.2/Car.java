public abstract class Car implements Location{
	private double[] loc;
	private int ID;
	
	public Car(){
		ID = (int)(Math.random() * (Math.pow(10, 6) - 1) + 1); //1 to 999999
	}
	
	public double[] getLoc(){
		return loc;
	}
	
	public int getID(){
		return ID;
	}
	
	public void move(double x, double y){
		loc = new double[] {x, y};
	}
}