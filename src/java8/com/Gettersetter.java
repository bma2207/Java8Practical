package java8.com;

public class Gettersetter {

	int EmpId;
	String EmpName;
	String Address;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gettersetter gs = new Gettersetter();
		gs.setEmpId(10);
		gs.setEmpName("bhushan");
		gs.setAddress("Surat");

		System.out.println(gs.getEmpId());
		System.out.println(gs.getEmpName());
		System.out.println(gs.getAddress());
	}

}
