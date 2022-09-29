
public class Mammal {
	// member variables
	
	private String name;
	protected int energyLevel;
	
	// constructors
	
	public Mammal(String name) {
		this.name=name;
		this.energyLevel = 50;
	}

	// Getters & Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	

	
	// Other Methods
	
		public void displayEnergy() {
			System.out.println(this.name + " energy is: " + this.energyLevel);
		}
}
