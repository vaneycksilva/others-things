package factoryMethod;

public abstract class PizzaStore {

	public Pizza orderPizza(String type){
		
		Pizza pizza = createPizza(type);
		
		System.out.println(pizza.prepare());
		System.out.println(pizza.bake());
		System.out.println(pizza.cutSlices());
		System.out.println(pizza.box());
		return pizza;
		
	}
	
	protected abstract Pizza createPizza(String type);
}
