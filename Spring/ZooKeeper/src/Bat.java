
public class Bat extends Mammal {

	public Bat(String name) {
		super(name);
		this.energyLevel = 300;
	}
	
	// Fly
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Wooossshhh");
	}

	// Eat Humans
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("so - well, nevermind.");
	}
	
	// Attack Town
	
	public void attackTown(){
		this.energyLevel -= 100;
		System.out.println("fire noises...");
	}
}
