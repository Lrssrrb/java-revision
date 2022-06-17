package day3.question4;

public class Ola {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger < 4) {
			Car c1 = new HatchBack(numberOfPassenger,numberOfKMs);
			return c1;
		}
		else {
			Car c1 = new Sedan(numberOfPassenger,numberOfKMs);
			return c1;
		}
	}
	
	public int calculateBill(Car car) {
		if(car.getClass().getSimpleName().equals("HatchBack")) {
			HatchBack h = new HatchBack(car.getNumberOfPassenger(),car.getNumberOfKms());
			return car.getNumberOfKms() * h.farePerKm;
		}
		else {
			Sedan s = new Sedan(car.getNumberOfPassenger(),car.getNumberOfKms());
			return car.getNumberOfKms() * s.farePerKm;
		}
	}
}
