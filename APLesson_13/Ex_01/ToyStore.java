import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore(){
		this("");
	}
	
	public ToyStore(String toys){
		this.loadToys(toys);
	}
	
	void loadToys(String ts){
		ArrayList<String> toys = new ArrayList(Arrays.asList(ts.split(", ")));
		
		for(int i = 0; i < toys.size(); i+=2){
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy object = this.toyWithName(name);
			
			if(object != null)
				object.setCount(object.getCount() + 1);
			else{
				switch(type){
					case "AF":
						toyList.add(new AFigure(name));
						break;
					case "Car":
						toyList.add(new Car(name));
						break;
					default:
						//Unrecognized type
						break;
				}
			}
		}
	}
	
	Toy toyWithName(String name){
		for(Toy object : toyList){
			if(name.equals(object.getName()))
				return object;
		}
		return null;
	}
	
	public String getMostFrequentToy(){
		String name = "";
		int max = Integer.MIN_VALUE;
		
		for(Toy object : toyList){
			if(max < object.getCount()){
				max = object.getCount();
				name = object.getName();
			}
		}
		
		return name;
	}
	
	public String getMostFrequentType(){
		int car = 0;
		int figure = 0;
		
		for(Toy object : toyList){
			switch(object.getType()){
				case "Car":
					car++;
					break;
				case "Action Figure":
					figure++;
					break;
				default:
					//Unrecognized type
					break;
			}
		}
		
		if(car > figure)
			return "Cars";
		else if(figure > car)
			return "Action Figures";
		else
			return "Equal Amounts";
	}
	
	public String toString(){
		return toyList + "";
	}
}