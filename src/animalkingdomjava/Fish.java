package animalkingdomjava;

public class Fish extends AbstractAnimal {
	private String moveType;
	private String breathType;
	private String repType;

	public Fish(int animalId, String animalName, int animalYear) {
		super(animalId, animalName, animalYear);
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
}

// * [ ] Fish move - swim, breath - gills, reproduce - eggs
