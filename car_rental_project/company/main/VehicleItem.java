package tuc.ece.cs102.company.main;

import tuc.ece.cs102.company.model.Vehicle.Bike;
import tuc.ece.cs102.company.model.Vehicle.Car;
import tuc.ece.cs102.company.model.Vehicle.Vehicle;
import tuc.ece.cs102.list.Item;

public class VehicleItem extends Item{
	
	private Vehicle vehicle;
	
	public VehicleItem(Vehicle ive) {
		this.vehicle = ive;
	}
	
	public VehicleItem(Car ic) {
		this.vehicle = ic;
	}
	
	public VehicleItem(Bike ib) {
		this.vehicle = ib;
	}

	public Object key() {
		return vehicle.getLicence();
	}
	
	public boolean equals(Item o) {
		return key().equals(o.key());

	}

	public boolean less(Item o) {
		if ((key()).equals(o.key()))
			return true;
		return false;

	}
	
	public void print() {
		vehicle.print();
	}
	
	public String toString() {
		return vehicle.toString();
	}
	
	public Object getData() {
		return this.vehicle;
	}


}


