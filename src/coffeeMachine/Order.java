package coffeeMachine;

public class Order {

	private Drink drink;
	private int sucre;
	private double amount;

	public Order(Drink drink, int sucre, double amount) {
		this.drink = drink;
		this.sucre = sucre;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
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

}
