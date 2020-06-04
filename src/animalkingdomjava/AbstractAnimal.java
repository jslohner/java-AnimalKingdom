package animalkingdomjava;

abstract class AbstractAnimal {
	private static int maxId = 0;

	protected int animalId;
	protected String animalName;
	protected int animalYear;

	public AbstractAnimal(String animalName, int animalYear) {
		animalId = maxId;
		maxId++;
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
