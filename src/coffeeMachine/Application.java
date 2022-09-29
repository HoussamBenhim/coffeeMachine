package coffeeMachine;

public class Application {

	public static void main(String[] args) {
		Maker maker = new MakerImpl();
		String res = maker.transformer(new Order(Drink.THE, 2));
		System.out.println(res);
	}

}
