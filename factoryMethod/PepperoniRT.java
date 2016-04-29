package factoryMethod;

public class PepperoniRT extends Pizza{

	
	public PepperoniRT() {
		// TODO Auto-generated constructor stub
		setTime(10);
		setTemperature(500);
	}
	
	@Override
	public String prepare() {
		// TODO Auto-generated method stub
		return "Descrição Pizza Peppperoni: \nPepperoni, muito queijo, molho apimentado.";
	}

}
