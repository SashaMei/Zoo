public class Emu extends Bird {

	 public Emu(String name) {
	  super(name);
	 }
	 
	 @Override
	 public String toString() {
	  return  super.toString() + "  " + "Emu";
	 }
	
	 @Override
	 public boolean canFly() {
	  return false;
	 }

}