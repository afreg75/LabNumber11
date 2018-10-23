 
 
public class UsedCar extends Car {

	private double mileage;
	
	public UsedCar() {}
	
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}
	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return String.format("%-1s%-12s%-3s%-1s$%-3s%-3s%-8s%-8s", getMake(), getModel() , getYear(),  " for ", getPrice(), 
				" (Used)", mileage, "miles");
	}
}
