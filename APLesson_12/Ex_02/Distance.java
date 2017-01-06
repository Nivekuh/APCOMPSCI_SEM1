public class Distance{
	static double x1, y1, x2, y2, distance;
	
	public Distance(){
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		distance = 0;
	}
	
	public Distance(double xOne, double yOne, double xTwo, double yTwo){
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
		distance = 0;
	}
	
	public void setParams(double xOne, double yOne, double xTwo, double yTwo){
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
	}
	
	public double getDistance(){
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return distance;
	}
}