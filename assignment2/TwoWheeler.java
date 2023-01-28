package week1.assignment2;

public class TwoWheeler {
	String bikeName = "ROYAL ENFIELD CLASSIC 350";
	byte noOfWheels = 2;
	short noOfMirror = 2;
	long chassisNumber = 2345664465775l;
	double runningKm = 56500.70;
	boolean isPunctured ;
	
	public static void main(String[] args) {
		TwoWheeler twowheeler = new TwoWheeler();
		System.out.println("Bike name is " + twowheeler.bikeName);
		System.out.println(twowheeler.bikeName + " it will have " + twowheeler.noOfWheels + " wheels ");
		System.out.println(twowheeler.bikeName + " it will have " + twowheeler.noOfMirror + " mirrors ");
		System.out.println(twowheeler.bikeName + " chassis number is " + twowheeler.chassisNumber);
		System.out.println(twowheeler.bikeName + " running km is " + twowheeler.runningKm);
		System.out.println(twowheeler.bikeName + " punctured or not " + twowheeler.isPunctured);
	}
	
	
	

}
