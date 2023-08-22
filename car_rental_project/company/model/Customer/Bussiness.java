package tuc.ece.cs102.company.model.Customer;

public class Bussiness extends Customer{
	
	double discount;
	
	public Bussiness(String fn,String afm,String pn,String city,String country,double discount) {
		super(fn,afm,pn,city,country);
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public void print() {
		System.out.println("Customer>Bussiness: " + this.toString());
		
	}

	@Override
	public String toString() {
		return "Full Name: " + getFullName() + "\nAfm: " + getAfm() + "\nPhone Number: " + getPhoneNum() + "\nCity: " + getCity() + "\nCountry: " + getCountry() + "\nDiscount: " + getDiscount();
	}
	
	

}