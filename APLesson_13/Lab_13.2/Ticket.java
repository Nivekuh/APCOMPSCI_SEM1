abstract public class Ticket{
	private int serialNo;
	
	public Ticket(){
		serialNo = (int)(Math.random() * (Math.pow(10, 7) - 1) + 1); //1 to 9999999
	}
	
	public int getSerialNo(){
		return serialNo;
	}
	
	abstract public double getPrice();
	
	public String toString(){
		return "Serial #: " + this.getSerialNo() + "\nPrice: " + this.getPrice();
	}
}