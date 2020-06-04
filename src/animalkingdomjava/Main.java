package animalkingdomjava;

import java.util.*;

public class Main {
	private static List<AbstractAnimal> filteredAnimals = new ArrayList<>();

	private static void filterAnimals(List<AbstractAnimal> animalList, CheckAnimal tester) {
		filteredAnimals.clear();
		for (AbstractAnimal a : animalList) {
			if (tester.test(a)) {
				filteredAnimals.add(a);
			}
		}
	}

	public static void main(String[] args) {
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Racoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		List<AbstractAnimal> animalList = new ArrayList<>();
		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigfoot);

		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);

		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		System.out.println("*** List all the animals in descending order by year named ***");
		animalList.sort(Comparator.comparing(a -> (int)a.getAnimalYear(), Comparator.reverseOrder()));
		animalList.forEach(a -> System.out.println(a));
		System.out.println();

		System.out.println("*** List all the animals alphabetically ***");
		animalList.sort((a1, a2) -> a1.getAnimalName().compareToIgnoreCase(a2.getAnimalName()));
		animalList.forEach(a -> System.out.println(a));
		System.out.println();

		System.out.println("*** List all the animals order by how they move ***");
		animalList.sort((a1, a2) -> a1.getMoveType().compareToIgnoreCase(a2.getMoveType()));
		animalList.forEach(a -> System.out.println(a));
		System.out.println();

		System.out.println("*** List only those animals the breath with lungs ***");
		filterAnimals(animalList, a -> a.getBreathType() == "lungs");
		filteredAnimals.forEach(a -> System.out.println(a));
		System.out.println();

		System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
		filterAnimals(animalList, a -> (a.getBreathType() == "lungs") && (a.getAnimalYear() == 1758));
		filteredAnimals.forEach(a -> System.out.println(a));
		System.out.println();

		System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
		filterAnimals(animalList, a -> (a.getRepType() == "eggs") && (a.getBreathType() == "lungs"));
		filteredAnimals.forEach(a -> System.out.println(a));
		System.out.println();

		System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
		filterAnimals(animalList, a -> a.getAnimalYear() == 1758);
		filteredAnimals.sort((a1, a2) -> a1.getAnimalName().compareToIgnoreCase(a2.getAnimalName()));
		filteredAnimals.forEach(a -> System.out.println(a));
	}
}

// * [ ] List all the animals in descending order by year named
// * [ ] List all the animals alphabetically
// * [ ] List all the animals order by how they move
// * [ ] List only those animals the breath with lungs
// * [ ] List only those animals that breath with lungs and were named in 1758
// * [ ] List only those animals that lay eggs and breath with lungs
// * [ ] List alphabetically only those animals that were named in 1758
