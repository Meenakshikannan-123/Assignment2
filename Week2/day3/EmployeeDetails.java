package Week2.day3;

public class EmployeeDetails {
	 public void employeeName(String empName)
	 {System.out.println("empName= "+empName);
		 }
	 public void employeeID(int empID) {
		 System.out.println("empID= "+empID);
	 }
	 public void employeeAddress(String empAddress) {
		 System.out.println("empAddress=" +empAddress);
	 }
	 public void employeeSalary(double empSalary) {
		 System.out.println("empSalary=" +empSalary);
	 }
	 public void employeeMobileNumber(long mobNumber) {
		 System.out.println("mobNumber=" +mobNumber);
	 }
	 
	 public static void main(String[] args) {
		EmployeeDetails empDetail =new EmployeeDetails();
		empDetail.employeeAddress("Meenakshi");
		empDetail.employeeID(1108);
		empDetail.employeeAddress("Chennai");
		empDetail.employeeSalary(30000.00);
		empDetail.employeeMobileNumber(9940615693L);
	}
}
