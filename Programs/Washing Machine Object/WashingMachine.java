
public class WashingMachine {
	
	String brand;
	String functionType;
	int energyRating;
	int washingCapacity;
	String washingMethod;
	int spinSpeed;
	String color;
	int warranty;
	String tubMaterial;
	boolean hasDigitalDisplay;
	
	public WashingMachine(String brand, String functionType, int energyRating, int washingCapacity,
			String washingMethod, int spinSpeed, String color, int warranty, String tubMaterial,
			boolean hasDigitalDisplay) {
		super();
		this.brand = brand;
		this.functionType = functionType;
		this.energyRating = energyRating;
		this.washingCapacity = washingCapacity;
		this.washingMethod = washingMethod;
		this.spinSpeed = spinSpeed;
		this.color = color;
		this.warranty = warranty;
		this.tubMaterial = tubMaterial;
		this.hasDigitalDisplay = hasDigitalDisplay;
	}
	
	public void washing() {
		System.out.println(brand+" washing machine washes different materials of clothes like cotton,jeans,silk and wool");
	}
	
	public void timer() {
		System.out.println(brand+" washing machine washes clothes according to the washing time set by the user and turns off automatically when is washing time is over");
	}	
	

}
