
public class Whale extends Mammal implements WaterDweller {
	
	public Whale(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\tWhale";
	}
	
	@Override
	public boolean canLiveOutOfWater(){
		return false;
	}
	

}
