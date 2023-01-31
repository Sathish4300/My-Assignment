package week2.assignment3;

public class EmployeeDetails{
		public void empNameId(){
			String empName = "SATHISH";
			int empId = 414860;
			System.out.println(" I am " + empName + " my employee ID is " + empId);
		}
		
		public void getEmpAddress() {
			String address = "CHENNAI";
			System.out.println(" I lived in " + address);
		}
		
		public void employSalary() {
			double salary = 1800.50;
			System.out.println(" My salary per day was " + salary);
		}
		public void empPhoneNumber() {
			long phoneNumber = 8623689012l;
			System.out.println(" My phone number is " + phoneNumber);
		}
		
		public static void main(String[] args) {
			
			EmployeeDetails details = new EmployeeDetails();
			details.empNameId();
			details.empPhoneNumber();
			details.employSalary();
			details.getEmpAddress();
		}
	

}
