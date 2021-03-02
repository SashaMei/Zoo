public class Parakeet extends Bird implements Adoptable{

	 public Parakeet(String name) {
	  super(name);
	 }
	 
	 @Override
	 public String homeCareDirections() {
	  return "Feed, talk to, and give lots of love.";
	 }
	
	 @Override
	 public String toString() {
	  return  super.toString() + "  " + "Parakeet";
	 }
	
	 @Override
	 public boolean canFly() {
	  return true;
	 }

}