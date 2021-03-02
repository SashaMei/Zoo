
public abstract class Mammal extends Animal{
	
	public Mammal(String name) {
		super(name);
	}
	
	@Override
	public boolean isWarmBlooded() {
	
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\tWarm Blooded\tMammal"; 
	}

}
