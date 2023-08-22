package tuc.ece.cs102.company.model.Vehicle;

public class Bike extends Passenger{
	
private BikeChar bikechar;
	
	public Bike(String licence,String Brand,String dor,int totaldistance,double price,int maxPass,int cc,BikeChar bikechar) {
		super(licence,Brand,dor,totaldistance,price,maxPass,cc);
		this.bikechar = bikechar;
	}

	public BikeChar getBikechar() {
		return bikechar;
	}

	public void setBikechar(BikeChar bikechar) {
		this.bikechar = bikechar;
	}

	@Override
	public void print() {
		System.out.println("Vehicle>Passenger>Bike: " + this.toString());
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Licence: " + getLicence() + "\nBrand: " + getBrand() + "\nDate Of Release: " + getDate() + "\nTotal Distance: " + getTotalDistance() + "\nPrice: " + getPrice() + "\nMax Passengers: " + getMaxPass() + "\nCC: " + getCc() + "\nCharacteristic: " + getBikechar();
	}

}
