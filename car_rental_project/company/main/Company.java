package tuc.ece.cs102.company.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import tuc.ece.cs102.company.model.Customer.Bussiness;
import tuc.ece.cs102.company.model.Customer.Citizens;
import tuc.ece.cs102.company.model.Customer.Customer;
import tuc.ece.cs102.company.model.Rentals.Rental;
import tuc.ece.cs102.company.model.Vehicle.*;


public class Company {
	
	private String CompanyName;
	private String afm;
	private String hq;
	private CustomerSortedList customers;
	private VehicleSortedList vehicles;
	private RentalSortedList rentals;
	
	public Company() throws ParseException {
		CompanyName = "The Company";
		afm = "100200018";
		hq = "Montreal";
		customers = new CustomerSortedList();
		vehicles = new VehicleSortedList();
		rentals = new RentalSortedList();
		
		vehicles.insert(new VehicleItem(new Car("XNK5544","Mercedes C200","2012",120000,50,5,1800,4,CarChar.valueOf("BATTERY"))));
		vehicles.insert(new VehicleItem(new Car("XNA1204","Honda Pilot","2019",5000,70,7,3000,5,CarChar.valueOf("DIESEL"))));
		vehicles.insert(new VehicleItem(new Car("XNM1345","Mercedes MiniBXS","2018",6000,100,12,3000,4,CarChar.valueOf("DIESEL"))));
		vehicles.insert(new VehicleItem(new Bike("XNO1706","Yamaha YZF-R3","2015",60500,45,2,600,BikeChar.valueOf("TOURING"))));
		vehicles.insert(new VehicleItem(new Bike("XNX9901","Kawasaki Ninja 300","2012",32000,30,2,300,BikeChar.valueOf("CRUISER"))));
		vehicles.insert(new VehicleItem(new Trucks("XNA1207","Volvo FH16","2017",90000,250,20000,3,4)));
		vehicles.insert(new VehicleItem(new Trucks("XNA1208","Scania XD1","2018",80000,300,25000,3,3)));
		
		customers.insert(new CustomerItem(new Citizens("Nikos Arabatzis","123456789","3028210373","Chania","Greece")));
		customers.insert(new CustomerItem(new Citizens("Johanes Stevenson","987456321","4621097275","Stockholm","Sweden")));
		customers.insert(new CustomerItem(new Bussiness("Nick Malone","741258962","3536975589","Dublin","Ireland",10)));
		customers.insert(new CustomerItem(new Bussiness("Tim Roberg","258963147","3265738648","Brussels","Belgium",20)));
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		rentals.insert(new RentalItem(new Rental(100,searchForCustomer("Nikos Arabatzis"),searchForVehicle("XNK5544"),df.parse("2019/04/03"),df.parse("2019/04/22"),950)));
		rentals.insert(new RentalItem(new Rental(101,searchForCustomer("Johanes Stevenson"),searchForVehicle("XNA1204"),df.parse("2019/04/05"),df.parse("2019/04/08"),210)));
		rentals.insert(new RentalItem(new Rental(102,searchForCustomer("Nick Malone"),searchForVehicle("XNO1706"),df.parse("2019/06/05"),df.parse("2019/06/15"),405)));
		rentals.insert(new RentalItem(new Rental(103,searchForCustomer("Tim Roberg"),searchForVehicle("XNX9901"),df.parse("2019/06/05"),df.parse("2019/06/15"),240)));
		rentals.insert(new RentalItem(new Rental(104,searchForCustomer("Nikos Arabatzis"),searchForVehicle("XNA1207"),df.parse("2019/06/05"),df.parse("2019/06/14"),2250)));
		rentals.insert(new RentalItem(new Rental(105,searchForCustomer("Johanes Stevenson"),searchForVehicle("XNA1208"),df.parse("2019/06/07"),df.parse("2019/06/15"),2400)));
		rentals.insert(new RentalItem(new Rental(106,searchForCustomer("Nick Malone"),searchForVehicle("XNK5544"),df.parse("2019/06/05"),df.parse("2019/06/15"),450)));
		rentals.insert(new RentalItem(new Rental(107,searchForCustomer("Tim Roberg"),searchForVehicle("XNM1345"),df.parse("2019/08/05"),df.parse("2019/08/15"),800)));
		
	}
	
	public void setCompanyName(String n) {
		CompanyName = n;
	}
	
	public void setAfm(String d) {
		afm = d;
	}
	
	public void setHq(String d) {
		hq = d;
	}
		
	public CustomerSortedList getCustomers() {
		return customers;
	}

	public void setCustomers(CustomerSortedList customers) {
		this.customers = customers;
	}

	public VehicleSortedList getVehicles() {
		return vehicles;
	}

	public void setVehicles(VehicleSortedList vehicles) {
		this.vehicles = vehicles;
	}

	public RentalSortedList getRentals() {
		return rentals;
	}

	public void setRentals(RentalSortedList rentals) {
		this.rentals = rentals;
	}

	public void print() {
		System.out.println("---------------Company----------------------");				
		System.out.println(CompanyName);
		System.out.println(afm);
		System.out.println(hq);
		System.out.println("---------------Customers-------------------");		
		vehicles.print();
	}
	
	public void addCustomer(Customer cust){		
		customers.insert(new CustomerItem(cust));
	}
	
	public void addVehicle(Vehicle veh) {
		vehicles.insert(new VehicleItem(veh));		
	}
	
	public Vehicle searchForVehicle(String licence){
		VehicleItem vItem = (VehicleItem)vehicles.search(licence);
		if (vItem==null){
			return null;
		}else{
			return (Vehicle)vItem.getData();
		}
	}
	
	public Customer searchForCustomer(String afm){
		CustomerItem cItem = (CustomerItem)customers.search(afm);
		if (cItem!=null){		
			return (Customer)cItem.getData();
		}else{
			return null;
		}
	}
	
	public RentalItem searchForRental(String key){
		RentalItem rItem = (RentalItem)rentals.search(key);
		if (rItem!=null){		
			return rItem;
		}else{
			return null;
		}
	}
	
	public void printCutsomersByCategory(String catClass){
		customers.printItemsInHierarchy(catClass);
	}
	
	public void printVehiclesByCategory(String catClass){
		vehicles.printItemsInHierarchy(catClass);
	}
	
	public VehicleItem findVehicle(String licence){
		VehicleItem vItem = (VehicleItem) vehicles.search(licence);
		if (vItem==null){
			return null;
		}else{
			return vItem;
		}
	}
	
	public CustomerItem findCustomer(String AFM){
		CustomerItem cItem = (CustomerItem)customers.search(AFM);
		if (cItem==null){
			return null;
		}else{
			return cItem;
		}
	}
	
	public CustomerSortedList deleteCustomer(CustomerItem c) {
		customers.delete(c);
		return customers;
	}
	
	public CustomerSortedList deleteVehicle(VehicleItem v) {
		vehicles.delete(v);
		return customers;
	}
	
}

