


public abstract class Bird extends Animal implements Winged{
	
	public Bird(String name) {
	  super(name);
	 }
	 
	 @Override
	 public boolean isWarmBlooded() {
	  return true;
	 }
	
	 @Override
	 public String toString() {
	  return super.toString() + "\tWarm Blooded" + "\tBird";
	 }
	 
}