package coffeeMachine;

public class MakerImpl implements Maker {

	@Override
	public String transformer(Order order) {
		StringBuilder res = new StringBuilder();
		res.append(order.getDrink().type)
				.append(":")
				.append(order.getSucre() > 0 ? order.getSucre() : "")
				.append(":")
				.append(order.getSucre() > 0 ? "0" : "");
		return res.toString();
	}

}
