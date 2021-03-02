public abstract class Animal {
 
	private String name;
 
	public Animal(String name) {
		this.name = name;
	}

	public abstract boolean isWarmBlooded();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal name: " + name;
	}
 
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal anotherAnimal = (Animal) obj;
			return (name.equalsIgnoreCase(anotherAnimal.name) && this.isWarmBlooded() == anotherAnimal.isWarmBlooded());
		}else {
			return false;
		}
	}
}