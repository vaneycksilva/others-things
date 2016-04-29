package factoryMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaStore rt = new RTPizzaStore();
		PizzaStore jp = new JPPizzaStore();
		
		System.out.println("PizzaStore - RIO TINTO (sqn)\n");
		rt.orderPizza("pepperoni");
		System.out.println("\n");
		rt.orderPizza("mussarela");
		System.out.println("\n");
		rt.orderPizza("marguerita");
		
		System.out.println("\nPizzaStore - JOÃO PESSOA\n");
		jp.orderPizza("marguerita");
		System.out.println("\n");
		jp.orderPizza("pepperOni");
		System.out.println("\n");
		jp.orderPizza("mussarela");
	/*	
		System.out.println(pizza1.orderPizza("mussarela").prepare());
		System.out.println(pizza1.orderPizza("mussarela").cutSlices());
		System.out.println(pizza1.orderPizza("mussarela").bake());
	*/

	}

}
