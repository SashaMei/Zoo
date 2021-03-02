public abstract class Fish extends Animal implements WaterDweller {

	 public Fish(String name) {
	  super(name);
	 }
	
	 @Override
	 public boolean isWarmBlooded() {
	  return false;
	 }
	
	 @Override
	 public String toString() {
	  return super.toString() + "\tCold Blooded" + "\tFish";
	 }
 
}