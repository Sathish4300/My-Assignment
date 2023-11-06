package groups;

import org.testng.annotations.Test;

public class LearnGoupssss {
	@Test(groups = {"smoke"},priority = 1)
	public void signUp() {
		System.out.println("signup");
	}
	@Test(groups = {"smoke"},priority = 2)
	public void logIn() {
		System.out.println("Login");
	}
	@Test(groups = {"sanity"})
	public void watchLiveStreaming() {
		System.out.println("Watch Live Streaming");
	}
	@Test(groups = {"reg"})
	public void addToCart() {
		System.out.println("Add to cart");
	}
	@Test(groups = {"sanity"})
	public void paymentGateway() {
		System.out.println("Payment Gateway");
	}
	@Test(groups = {"reg"})
	public void myOrder() {
		System.out.println("My order");
}
}
