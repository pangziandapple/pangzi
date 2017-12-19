package pangzi.apple.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;

import pangzi.apple.mq.product.Product;

public class Start {

	public static void main(String[] args) {
//		testProduct();
		testCustomer();
	}
	
	public static void testProduct(){
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"rabbitmq-product.xml");
		Product product = ctx.getBean(Product.class);
		String message = "{\"name\":\"product\"}";
		product.sendMessage(message);
	}
	
	public static void testCustomer(){
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"rabbitmq-customer.xml");
	}
}
