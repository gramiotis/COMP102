package tuc.ece.cs102.company.model.Customer;

public abstract class Customer {
	
	private String fullName;
	private String Afm;
	private String phoneNum;
	private String city;
	private String country;
	
	public Customer(String fn,String afm,String pn,String city,String country) {
		this.fullName = fn;
		this.Afm = afm;
		this.phoneNum = pn;
		this.city = city;
		this.country = country;
		
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAfm() {
		return Afm;
	}

	public void setAfm(String afm) {
		Afm = afm;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public abstract void print();
	
	public abstract String toString();

}

