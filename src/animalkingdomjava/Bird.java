package animalkingdomjava;

public class Bird extends AbstractAnimal {
	private String moveType;
	private String breathType;
	private String repType;

	public Bird(String animalName, int animalYear) {
		super(animalName, animalYear);
		moveType = "fly";
		breathType = "lungs";
		repType = "eggs";
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

// * [ ] Birds move - fly, breath - lungs, reproduce - eggs
