package week1.assignment2;

public class Mobiles {
	String mobileBrandName = "REALME 11 PRO";
	char mobileLogo = 'R';
	short noOfMobilePiece = 7;
	int modelNumber = 45244635;
	long mobileImeiNumber = 987875876828928672L;
	float mobilePrice = 24000.50f;
	boolean isDamaged;
	
	public static void main(String[] args) {
		Mobiles mobile = new Mobiles();
		System.out.println("Mobile brand name is "+ mobile.mobileBrandName);
		System.out.println(mobile.mobileBrandName + " brand logo is " + mobile.mobileLogo) ;
		System.out.println(mobile.mobileBrandName + " it will have " + mobile.noOfMobilePiece + " piece remaining ");
		System.out.println(mobile.mobileBrandName + " model number is " + mobile.modelNumber);
		System.out.println(mobile.mobileBrandName + " mobile IMEI Number is " + mobile.mobileImeiNumber);
		System.out.println(mobile.mobileBrandName + " price is " + mobile.mobilePrice);
		System.out.println(mobile.mobileBrandName + " is damaged or not " + mobile.isDamaged);
		
	}

}
