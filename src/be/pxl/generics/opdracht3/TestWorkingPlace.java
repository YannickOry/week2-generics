package be.pxl.generics.opdracht3;

public class TestWorkingPlace {
	public static void main(String[] args) {
		
		Car car = new Car();
		WorkingPlace<Car> test = new WorkingPlace<>();
		test.startFixing(car);
		
		
		
	}
}
