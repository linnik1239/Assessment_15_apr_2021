
public class Student {
	
	int prn;
	String name;
	String address;
	
	public Student(int prn,String name,String address) {
		this.name = name;
		this.prn = prn;
		this.address = address;
		
	}
	
	public int getPrn() {
		return this.prn;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
		

}
