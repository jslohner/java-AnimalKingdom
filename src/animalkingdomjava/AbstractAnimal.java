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

	abstract String getMoveType();
	abstract String getBreathType();
	abstract String getRepType();

	void eat() {
		// eat food???
	}

	int getAnimalId() {
		return animalId;
	}

	String getAnimalName() {
		return animalName;
	}

	int getAnimalYear() {
		return animalYear;
	}
}
