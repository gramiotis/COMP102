package tuc.ece.cs102.company.model.Rentals;

import java.util.Date;

import tuc.ece.cs102.company.model.Customer.Customer;
import tuc.ece.cs102.company.model.Vehicle.Vehicle;
import tuc.ece.cs102.util.DatePeriod;

public class Rental {
	
	private int rentalCode;
	private Customer cust;
	private Vehicle veh;
	private Date dateOfDelivery;
	private Date dateOfReturn;
	private int totalCost;
	
	public Rental(int rc,Customer cust,Vehicle veh,Date dod,Date dor,int tc) {
		this.rentalCode = rc;
		this.cust = cust;
		this.veh = veh;
		this.dateOfDelivery = dod;
		this.dateOfReturn = dor;
		this.totalCost = tc;
	}

	public int getRentalCode() {
		return rentalCode;
	}

	public void setRentalCode(int rentalCode) {
		this.rentalCode = rentalCode;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public Vehicle getVeh() {
		return veh;
	}

	public void setVeh(Vehicle veh) {
		this.veh = veh;
	}

	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}

	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}

	public Date getDateOfReturn() {
		return dateOfReturn;
	}

	public void setDateOfReturn(Date dateOfReturn) {
		this.dateOfReturn = dateOfReturn;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	
	public void print() {
		DatePeriod di = new DatePeriod(getDateOfDelivery(),getDateOfReturn());
		System.out.println("Rental code: " + getRentalCode());
		/*System.out.println("Customer: " + getCust().getFullName());*/
		System.out.println("Car: " + getVeh().getBrand());
		System.out.println("Date of Delivery-Date of Return:  " + di.toString());
		System.out.println("Total cost of Rental:" + getTotalCost());
	}
	

}
