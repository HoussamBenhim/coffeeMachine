package coffeeMachine;

public enum Drink {
	
	THE("T"),
	COFFEE("C"),
	CHOCOLATE("H");
	
	String type;
	
	Drink(String type){
		this.type = type;
	} 
	
}
