package tuc.ece.cs102.company.model.Vehicle;

public class Car extends Passenger {
	
	private int numDoors;
	private CarChar charact;
	
	public Car(String licence,String Brand,String dor,int totaldistance,double price,int maxPass,int cc,int numDoors,CarChar charact) {
		super(licence,Brand,dor,totaldistance,price,maxPass,cc);
		this.numDoors = numDoors;
		this.charact = charact;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public CarChar getCharact() {
		return charact;
	}

	public void setCharact(CarChar charact) {
		this.charact = charact;
	}

	@Override
	public void print() {
		System.out.println("Vehicle>Passenger>Car: " + this.toString());
		
	}

	@Override
	public String toString() {
		// TODO Auto method stub
		return "Licence: " + getLicence() + "\nBrand: " + getBrand() + "\nDate Of Release: " + getDate() + "\nTotal Distance: " + getTotalDistance() + "\nPrice: " + getPrice() + "\nMax Passengers: " + getMaxPass() + "\nCC: " + getCc() + "\nNumber Of Doors: " + getNumDoors() + "\nPower Source: " + getCharact();
	}
	
	
	

}


