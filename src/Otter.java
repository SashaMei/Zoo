
public class Otter extends Mammal implements WaterDweller {
	
	public Otter(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\tOtter" ;
	}
	@Override
	public boolean canLiveOutOfWater() {
		return true;
	}
}
