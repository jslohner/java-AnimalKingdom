package animalkingdomjava;

public class Mammal extends AbstractAnimal {
	private String moveType;
	private String breathType;
	private String repType;

	public Mammal(String animalName, int animalYear) {
		super(animalName, animalYear);
		moveType = "walk";
		breathType = "lungs";
		repType = "live births";
	}

	@Override
	public String getMoveType() {
		return moveType;
	}

	@Override
	public String getBreathType() {
		return breathType;
	}

	@Override
	public String getRepType() {
		return repType;
	}

	@Override
	public String toString() {
		return animalName + " " + repType + " " + moveType + " " + breathType + " " + animalYear;
	}
}

// * [ ] Mammals move - walk, breath - lungs, reproduce - live births
