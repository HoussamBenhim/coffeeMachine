package coffeeMachine;

public class Order {

	private Drink drink;
	private int sucre;
	boolean spoon;
	
	public Order(Drink drink,int sucre) {
		this.drink = drink;
		this.sucre = sucre;
		this.spoon = false;
	}
	
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	public int getSucre() {
		return sucre;
	}
	public void setSucre(int sucre) {
		this.sucre = sucre;
	}
	
	public boolean isSpoon() {
		return spoon;
	}

	public void setSpoon(boolean spoon) {
		this.spoon = spoon;
	}
	
		
}
