public class GameRunner{
	public static void main(String[]args){
		XBox xbox = new XBox();
		PlayStation ps = new PlayStation();
		PC masterRace = new PC("Crappy school computer");
		
		System.out.println(xbox + "\n\n" + ps + "\n\n" + masterRace);
	}
}