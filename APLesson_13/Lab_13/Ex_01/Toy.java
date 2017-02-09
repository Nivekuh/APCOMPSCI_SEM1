abstract public class Toy{
	private String name;
	private int count;
	
	public Toy(){
		this("");
	}
	
	public Toy(String nm){
		name = nm;
		count = 1;
	}
	
	public String getName(){
		return name;
	}
	
	public int getCount(){
		return count;
	}
	
	public void setName(String nm){
		name = nm;
	}
	
	public void setCount(int ct){
		count = ct;
	}
	
	abstract public String getType();
	
	public String toString(){
		return name + " - " + count;
	}
}