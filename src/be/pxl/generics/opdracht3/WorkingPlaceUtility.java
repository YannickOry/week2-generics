package be.pxl.generics.opdracht3;

public class WorkingPlaceUtility {
	public static <T extends Vehicle & Motorized >int getScore(WorkingPlace<T> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
