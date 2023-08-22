package tuc.ece.cs102.company.main;

import tuc.ece.cs102.company.model.Customer.Customer;
import tuc.ece.cs102.list.Item;

public class CustomerItem extends Item{

	private Customer customer;
	
	public CustomerItem(Customer cust) {
		this.customer = cust;
	}
	
	public Object key() {
		return customer.getAfm();
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
		customer.print();
	}
	
	public String toString() {
		return customer.toString();
	}
	
	public Object getData() {
		return this.customer;
	}


}
