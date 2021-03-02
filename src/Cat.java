
public class Cat extends Mammal implements Adoptable{
	
	public Cat(String name) {
		super(name);
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\tCat"+ "\t";
	}
	
	@Override
	public String homeCareDirections() {
		String s= "Feed, change";
		return s;
	}

}
