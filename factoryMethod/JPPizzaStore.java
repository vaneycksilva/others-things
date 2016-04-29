package factoryMethod;

public class JPPizzaStore  extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		
		Pizza pizza = null;
		if (type.equalsIgnoreCase("marguerita")) {
			pizza = new MarghritaJP();
		}else if (type.equalsIgnoreCase("pepperoni")) {
			pizza = new PepperoniJP();
		}else if (type.equalsIgnoreCase("mussarela"))
			pizza = new MoussarelaJP();
		return pizza;
	}
	

}
