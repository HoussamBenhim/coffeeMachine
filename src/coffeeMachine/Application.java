package coffeeMachine;

public class Application {

	public static void main(String[] args) {
		Maker maker = new MakerImpl();
		System.out.println(maker.transformer(new Order(Drink.THE, 2, 1d)));
		System.out.println(maker.transformer(new Order(Drink.COFFEE, 1, 0.2d)));
		System.out.println(maker.transformer(new Order(Drink.CHOCOLATE, 3, 0.8d)));
		System.out.println(maker.transformer(new Order(Drink.THE, 0, 0.1d)));
	}

}
