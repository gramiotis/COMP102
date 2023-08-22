package tuc.ece.cs102.company.model.Vehicle;

public class Trucks extends Vehicle{
	
	private int maxLoad;
	private double width;
	private double height;
	
	public Trucks(String licence,String Brand,String dor,int totaldistance,double price,int maxLoad,double width,double height) {
		super(licence,Brand,dor,totaldistance,price);
		this.maxLoad = maxLoad;
		this.width = width;
		this.height = height;
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void print() {
		System.out.println("Vehicle>Trucks: " + this.toString());
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Licence: " + getLicence() + "\nBrand: " + getBrand() + "\nDate Of Release: " + getDate() + "\nTotal Distance: " + getTotalDistance() + "\nPrice: " + getPrice() + "\nMax Load: " + getMaxLoad() + "\nHeight: " +  getHeight() + "\nWidth: " + getWidth();
	}

}

