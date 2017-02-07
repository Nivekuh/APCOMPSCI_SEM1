import java.util.ArrayList;
import java.util.Scanner;

public class ToyRunner{
	static Scanner kb = new Scanner(System.in);
	static String toys = "";
	
	public static void main(String[]args){
		/*Car car = new Car("Prius");
		AFigure figure = new AFigure("Peter's waifu");
		
		System.out.println(car + " " + figure);*/
		
		/*while(true){
			System.out.println("Would you like to enter a new toy? (Y or N)");
			if(kb.next().toLowerCase().equals("y"))
				promptToy();
			else
				break;
		}*/
		
		toys = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		
		ToyStore store = new ToyStore(toys);
		
		System.out.println(store);
		System.out.println("Most common Toy: " + store.getMostFrequentToy());
		System.out.println("Most common Type: " + store.getMostFrequentType());
	}
	
	static void promptToy(){
		if(!toys.equals(""))
			toys += ", ";
		
		System.out.println("Please enter a name");
		toys += kb.next();
		
		toys += ", ";
		
		System.out.println("Please enter a type ('AF' for Action Figure or 'Car' for Car)");
		toys += kb.next();
	}
}