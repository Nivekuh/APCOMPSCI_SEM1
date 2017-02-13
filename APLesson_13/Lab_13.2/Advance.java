public class Advance extends Ticket{
	private int daysLeft;
	
	public Advance(){
		this(0);
	}
	
	public Advance(int days){
		super();
		
		daysLeft = days;
	}
	
	public double getPrice(){
		return daysLeft >= 10 ? 30 : 40;
	}
}