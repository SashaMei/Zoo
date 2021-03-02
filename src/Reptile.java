public abstract class Reptile extends Animal {

	 public Reptile(String name) {
	  super(name);
	 }
	
	 @Override
	 public boolean isWarmBlooded() {
	  return false;
	 }
	
	 @Override
	 public String toString() {
	  return super.toString() + "\tCold Blooded" + "\tReptile";
	 }
}
 
