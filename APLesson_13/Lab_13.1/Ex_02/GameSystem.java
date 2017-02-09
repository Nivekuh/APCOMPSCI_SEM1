public class GameSystem{
	private String platform;
	private int serialNo;
	
	public GameSystem(){
		this("Undefined");
	}
	
	public GameSystem(String p){
		platform = p;
		serialNo = (int)(Math.random() * (Math.pow(10, 7) - 1) + 1); //1 to 9999999
	}
	
	public String getPlatform(){
		return platform;
	}
	
	public int getSerialNo(){
		return serialNo;
	}
}