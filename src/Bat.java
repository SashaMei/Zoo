
public class Bat extends Mammal implements Winged {
	
	public Bat(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\tBat";
	}
	
	@Override
	public boolean canFly() {
		 
		 return true;
	}
	
	

}
