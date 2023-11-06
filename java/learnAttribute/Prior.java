package learnAttribute;

import org.testng.annotations.Test;

public class Prior {
	@Test(priority = 1)
	public void signUp() {
		System.out.println("signup");
	}
	@Test(priority = 4)
	public void logIn() {
		System.out.println("Login");
	}
	@Test(priority = 2)
	public void watchLiveStreaming() {
		System.out.println("Watch Live Streaming");
	}
	@Test(priority = 3)
	public void addToCart() {
		System.out.println("Add to cart");
	}
	@Test(priority = 5)
	public void paymentGateway() {
		System.out.println("Payment Gateway");
	}
	@Test(priority = 6)
	public void myOrder() {
		System.out.println("My order");
	}

}
