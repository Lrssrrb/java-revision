package day3.question4;

public class Car {
	private int numberOfPassenger;
	private int numberOfKms;
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	@Override
	public String toString() {
		return "Car [numberOfPassenger=" + numberOfPassenger + ", numberOfKms=" + numberOfKms + "]";
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	public Car(int numberOfPassenger, int numberOfKms) {
		super();
		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKms = numberOfKms;
	}
	public Car() {
		super();
	}
	
	
}
