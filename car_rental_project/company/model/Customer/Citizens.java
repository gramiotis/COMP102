package tuc.ece.cs102.company.model.Customer;

public class Citizens extends Customer{
	
	public Citizens(String fn,String afm,String pn,String city,String country) {
		super(fn,afm,pn,city,country);
	}
	
	@Override
	public void print() {
		System.out.println("Customer>Citizen: " + this.toString());
	}
	
	@Override
	public String toString() {
		return "Full Name: " + getFullName() + "\nAfm: " + getAfm() + "\nPhone Number: " + getPhoneNum() + "\nCity: " + getCity() + "\nCountry: " + getCountry();
	}

}

