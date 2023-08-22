package tuc.ece.cs102.company.model.Vehicle;

public abstract class Vehicle {
	
	private String Licence;
	private String Brand;
	private String Date;
	private int totalDistance;
	private double price;
	
	public Vehicle(String l,String b,String d,int td,double price) {
		this.Licence = l;
		this.Brand = b;
		this.Date = d;
		this.totalDistance = td;
		this.price = price;
	}

	public String getLicence() {
		return Licence;
	}

	public void setLicence(String licence) {
		Licence = licence;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void print();
	
	public abstract String toString();

}

