
public class WashingMachineApp {
	public static void main(String[] args) {
		WashingMachine w1 = new WashingMachine("Samsung", "Fully Automatic Front Load", 5, 6, "Tumble", 1000, "White", 2, "Stainless Steel", true);
		w1.washing();
		w1.timer();
	}
}
