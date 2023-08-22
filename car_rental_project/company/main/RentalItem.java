package tuc.ece.cs102.company.main;

import tuc.ece.cs102.company.model.Rentals.Rental;
import tuc.ece.cs102.list.Item;
import tuc.ece.cs102.util.StandardInputRead;

public class RentalItem extends Item{
	
private Rental rental;
	
	public RentalItem(Rental rent) {
		this.rental = rent;
	}
	
	public Object key() {
	  StandardInputRead reader = new StandardInputRead();  
	  String answer = reader.readString("Vehicle or Customer:");
	  if(answer.equals("Vehicle"))
		return rental.getVeh().getLicence();
	  else return rental.getCust().getAfm();
		}
	
	public boolean equals(Item o) {
		return key().equals(o.key());

	}

	public boolean less(Item o) {
		/*if (!key().equals(o.key()))
			return true;*/
		return false;

	}
	
	public void print() {
		rental.print();
	}
	
	public String toString() {
		return rental.toString();
	}
	
	public Object getData() {
		return this.rental;
	}

}


