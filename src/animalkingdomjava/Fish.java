package animalkingdomjava;

public class Fish extends AbstractAnimal {
	private String moveType;
	private String breathType;
	private String repType;

	public Fish(String animalName, int animalYear) {
		super(animalName, animalYear);
		moveType = "swim";
		breathType = "gills";
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

// Parrot eggs fly lungs 1824

// * [ ] Fish move - swim, breath - gills, reproduce - eggs
