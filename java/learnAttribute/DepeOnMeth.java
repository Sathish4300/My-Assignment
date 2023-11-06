package learnAttribute;

import org.testng.annotations.Test;

public class DepeOnMeth {
	@Test
	public void signUp() {
		System.out.println("signup");
	}
	@Test(dependsOnMethods  = "addToCart")
	public void logIn() {
		System.out.println("Login");
	}
	@Test(dependsOnMethods = "signUp")
	public void watchLiveStreaming() {
		System.out.println("Watch Live Streaming");
	}
	@Test(dependsOnMethods = "watchLiveStreaming")
	public void addToCart() {
		System.out.println("Add to cart");
	}
	@Test(dependsOnMethods ="logIn" )
	public void paymentGateway() {
		System.out.println("Payment Gateway");
	}
	@Test(dependsOnMethods = "paymentGateway")
	public void myOrder() {
		System.out.println("My order");
}
}
