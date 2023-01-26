package Program.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("User can able to send the message");
	}
	public void shareDocuments() {
		System.out.println("User can share the document to another person");
	}
	public void call() {
		System.out.println("User can call to another person");
	}
	public static void main(String[] args) {
		Mobile mobile=  new Mobile();
		mobile.call();
		mobile.sendMessage();
		mobile.shareDocuments();
		
	}

}
