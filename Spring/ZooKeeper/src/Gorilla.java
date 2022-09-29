
public class Gorilla extends Mammal {

	public Gorilla(String name) {
		super(name);
	}
	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println( this.getName() + " threw a barrel!");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println(this.getName() + " ate a banana");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println(this.getName() + " climbed the tree");
	}

}
