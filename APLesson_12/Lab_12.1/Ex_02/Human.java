public class Human{
	static String hair, eyes, skin;
	
	public Human(){
		//Generic Aryan. Not necessarily superior to other races.
		hair = "Blonde";
		eyes = "Blue";
		skin = "White";
	}
	
	public Human(String h, String e, String s){
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHES(String h, String e, String s){
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair(){
		return hair;
	}
	
	public String getEyes(){
		return eyes;
	}
	
	public String getSkin(){
		return skin;
	}
	
	public void printInfo(){
		System.out.println("Info...\nHair:\t" + hair + "\nEyes:\t" + eyes + "\nSkin:\t" + skin);
	}
}