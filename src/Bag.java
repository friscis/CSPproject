
public class Bag {
	char name;
	int capacity;
	
	public Bag(char name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	
	public String toString() {
		return name + " of Cap: " + capacity;
	}
}
