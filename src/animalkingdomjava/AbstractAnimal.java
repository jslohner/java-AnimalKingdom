package animalkingdomjava;

abstract class AbstractAnimal {
	protected int animalId;
	protected String animalName;
	protected int animalYear;

	public AbstractAnimal(int animalId, String animalName, int animalYear) {
		this.animalId = animalId;
		this.animalName = animalName;
		this.animalYear = animalYear;
	}

	abstract int getAnimalId();
	abstract String getAnimalName();
	abstract int getAnimalYear();

	void eat() {
		// eat food???
	}

	abstract String getMoveType();
	abstract String getBreathType();
	abstract String getRepType();
}

// * [ ] Create an abstract class for animals
//   * [ ] All animals consume food the same way
//   * [ ] Each animal is assigned a unique number, a name, and year discovered regardless of classification.
//
// - [ ] Methods will return a string saying how that animal implements the action
//   - [ ] All animals can move, breath, reproduce. How they do that, so what string should get returned when the method is executed, varies by animal type.
