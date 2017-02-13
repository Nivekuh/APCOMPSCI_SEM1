public class TicketDriver{
	public static void main(String[]args){
		Walkup lazyFool = new Walkup();
		Advance lessLazyFool = new Advance(10);
		StudentAdvance stillVeryExpensive = new StudentAdvance(5);
		
		System.out.println(lazyFool + "\n\n" + lessLazyFool + "\n\n" + stillVeryExpensive);
	}
}