public class MilesPerHour{
	static double d, h, m, mph;
	
	public MilesPerHour(){
		d = 0;
		h = 0;
		m = 0;
		mph = 0;
	}
	
	public MilesPerHour(double dist, double hour, double minute){
		d = dist;
		h = hour;
		m = minute;
		mph = 0;
	}
	
	public void setParams(double dist, double hour, double minute){
		d = dist;
		h = hour;
		m = minute;
	}
	
	public double getMPH(){
		mph = d / (h + m / 60);
		return mph;
	}
}