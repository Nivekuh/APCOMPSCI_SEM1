public class Toyota extends Car{
	public Toyota(String pos){
		String[] posVals = pos.split(", ");
		this.move(Double.parseDouble(posVals[0]), Double.parseDouble(posVals[1]));
	}
}