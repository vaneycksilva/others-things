package factoryMethod;

public class RTPizzaStore  extends PizzaStore{

	
	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if (type.equals("pepperoni")) {
			pizza = new PepperoniRT();
		}else if(type.equals("marguerita")){
			pizza = new MarghritaRT();
		}else if(type.equals("mussarela")){
			pizza = new MoussarelaRT();
		}
		
		
		return pizza;
	}

}
