package animalkingdomjava;

public class Bird extends AbstractAnimal {
	private String moveType;
	private String breathType;
	private String repType;

	public Bird(int animalId, String animalName, int animalYear) {
		super(animalId, animalName, animalYear);
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
}

// * [ ] Birds move - fly, breath - lungs, reproduce - eggs
