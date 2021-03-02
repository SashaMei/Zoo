public class Turtle extends Reptile implements Adoptable, WaterDweller{

	 public Turtle(String name) {
	  super(name);
	 }
	
	 @Override
	 public String homeCareDirections() {
	  return "Feed, clean shell, and give lots of love.";
	 }
	
	 @Override
	 public String toString() {
	  return  super.toString() + "  " + "Turtle";
	 } 
	 
	 @Override
	 public boolean canLiveOutOfWater() {
		 return true;
	 }

}