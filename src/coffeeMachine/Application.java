package coffeeMachine;

public class Application {

	public static void main(String[] args) {
		Maker maker = new MakerImpl();
		System.out.println(maker.transformer(new Order(Drink.THE, 2)));
		System.out.println(maker.transformer(new Order(Drink.COFFEE, 1)));
		System.out.println(maker.transformer(new Order(Drink.CHOCOLATE, 3)));
		System.out.println(maker.transformer(new Order(Drink.THE, 0)));
	}

}
