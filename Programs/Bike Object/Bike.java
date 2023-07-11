
public class Bike {
	
	String brand;
	String modelName;
	int maximumSpeed;
	int mileage;
	String color;
	int warrantyPeriod;
	int engineDisplacement;
	String tyreType;
	String wheelType;
	int fuelTankCapacity;
	
	
	public Bike(String brand, String modelName, int maximumSpeed, int mileage, String color, int warrantyPeriod,
			int engineDisplacement, String tyreType, String wheelType, int fuelTankCapacity) {
		super();
		this.brand = brand;
		this.modelName = modelName;
		this.maximumSpeed = maximumSpeed;
		this.mileage = mileage;
		this.color = color;
		this.warrantyPeriod = warrantyPeriod;
		this.engineDisplacement = engineDisplacement;
		this.tyreType = tyreType;
		this.wheelType = wheelType;
		this.fuelTankCapacity = fuelTankCapacity;
	}
	
	public void transport() {
		System.out.println(brand+" "+modelName+" carries people and luggage from one place to other");
	}
	
	public void power() {
		System.out.println(brand+" "+modelName+" has good pickup and power as it's engine displacement is "+engineDisplacement+"cc");
	}
	
	

}
