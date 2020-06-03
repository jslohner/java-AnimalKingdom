package animalkingdomjava;

public class Mammal extends AbstractAnimal {
	private String moveType;
	private String breathType;
	private String repType;

	public Mammal(int animalId, String animalName, int animalYear) {
		super(animalId, animalName, animalYear);
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
}

// * [ ] Mammals move - walk, breath - lungs, reproduce - live births
