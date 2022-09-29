package coffeeMachine;

public enum Drink {
	
	THE("T",0.4d),
	COFFEE("C",0.6d),
	CHOCOLATE("H",0.5d);
	
	String type;
	double price;
	
	Drink(String type,double price){
		this.type = type;
		this.price = price;
	} 
	
}
