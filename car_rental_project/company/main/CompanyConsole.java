package tuc.ece.cs102.company.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import tuc.ece.cs102.company.model.Customer.Bussiness;
import tuc.ece.cs102.company.model.Customer.Citizens;
import tuc.ece.cs102.company.model.Customer.Customer;
import tuc.ece.cs102.company.model.Rentals.Rental;
import tuc.ece.cs102.company.model.Vehicle.Bike;
import tuc.ece.cs102.company.model.Vehicle.BikeChar;
import tuc.ece.cs102.company.model.Vehicle.Car;
import tuc.ece.cs102.company.model.Vehicle.CarChar;
import tuc.ece.cs102.company.model.Vehicle.Trucks;
import tuc.ece.cs102.company.model.Vehicle.Vehicle;
import tuc.ece.cs102.util.DatePeriod;
import tuc.ece.cs102.util.StandardInputRead;

public class CompanyConsole {
	
	private Company company;
	public Company getCompany() {
		return company;
		}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	private StandardInputRead reader;
	private int userOption;
	
	public CompanyConsole() throws ParseException {
		company = new Company();
		reader = new StandardInputRead();
		userOption=0;
	}
	
	public static void main(String[] args) throws ParseException, ClassNotFoundException {
	    CompanyConsole cc = new CompanyConsole();
		int userOption = 0;
		 StandardInputRead reader = new StandardInputRead();
		while (userOption!=11){
			 cc.printMenu();
	         String userInput = reader.readString("What would you like to do? ");
	            if (userInput == null) {
	                continue;
	            } else {
	                try {
	                    userOption = Integer.parseInt(userInput);
	                } catch (NumberFormatException ex) {
	                    userOption = 0;
	                }
	            }
	        switch(userOption) {
	           case 1:
	        	   cc.findVehicle();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 2:
	        	   cc.deleteVehicle();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 3:
	        	   cc.getCompany().print();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 4:
	        	   cc.printVehiclesByCategory();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 5:
	        	   cc.findCustomer();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 6:
	        	   cc.deleteCustomer();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 7:
	        	   cc.addNewRental();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 8:
	        	   cc.printRental();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 9:
	        	   cc.addNewVehicle();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 10:
	        	   cc.addNewCustomer();
	        	   reader.readString("Press any key to continue...");
	        	   break;
	           case 11:
	        	   System.out.println("Thanks for using the Company Console...");
	        	   break;
	           default:
	        	   System.out.println("User option " + userOption + " ignored...");
	               continue;
	        	 
	        }
	   }
		
		

	}

	private void printMenu() {
		System.out.println("----------------------Menu------------------------");
		System.out.println("--------------------------------------------------");		
		System.out.println("1)Search Vehicle");
		System.out.println("2)Delete Vehicle");
		System.out.println("3)Print Car Fleet");
		System.out.println("4)Search Vehicle's Category");
		System.out.println("5)Search Customer");
		System.out.println("6)Delete Customer");
		System.out.println("7)New Rental");
		System.out.println("8)Print Rental");
		System.out.println("9)Add New Vehicle");
		System.out.println("10)Add New Customer");
		System.out.println("11)Exit");
		
	}
	
	public void addNewVehicle(){
		userOption=0;
		while(userOption>4 || userOption<1){
			System.out.println("===========Insert New Vehicle============");		
			System.out.println("1) Car");
			System.out.println("2) Truck");
			System.out.println("3) Bike");
			System.out.println("4) Cancel");
			userOption= reader.readPositiveInt(":");
		}
		String licence,brand,dor,charact;
		int td,maxpass,cc,numdoors,maxload;
		double price,width,height;
		switch (userOption){		
		case 1:
			licence = reader.readString("Licence:");
			brand = reader.readString("Brand:");
			dor= reader.readString("Date Of Release:");
			td = reader.readPositiveInt("Total Distance:");
			price = reader.readPositiveFloat("Price:");
			maxpass = reader.readPositiveInt("Max Passengers:");
			cc = reader.readPositiveInt("CC:");
			numdoors = reader.readPositiveInt("Number Of Doors:");
			charact = reader.readString("Power Source:");
			Car c = new Car(licence,brand,dor,td,price,maxpass,cc,numdoors,CarChar.valueOf(charact));
			company.addVehicle(c);
			System.out.println("Car Added...");
			break;
		case 2:
			licence = reader.readString("Licence:");
			brand = reader.readString("Brand:");
			dor= reader.readString("Date Of Release:");
			td = reader.readPositiveInt("Total Distance:");
			price = reader.readPositiveFloat("Price:");
			maxload = reader.readPositiveInt("Max Load:");
			width = reader.readPositiveFloat("Width:");
			height = reader.readPositiveFloat("Height:");
			Trucks t = new Trucks(licence,brand,dor,td,price,maxload,width,height);
			company.addVehicle(t);
			System.out.println("Truck Added...");
			break;
		case 3:
			licence = reader.readString("Licence:");
			brand = reader.readString("Brand:");
			dor= reader.readString("Date Of Release:");
			td = reader.readPositiveInt("Total Distance:");
			price = reader.readPositiveFloat("Price:");
			maxpass = reader.readPositiveInt("Max Passengers:");
			cc = reader.readPositiveInt("CC:");
			charact = reader.readString("Bike's Characteristic:");
			Bike b = new Bike(licence,brand,dor,td,price,maxpass,cc,BikeChar.valueOf(charact));
			company.addVehicle(b);
			System.out.println("Bike Added...");
			break;		
		case 4:
			break;
		}
    }
	
	public void addNewCustomer(){
		userOption=0;
		while(userOption>3 || userOption<1){
			System.out.println("===========Insert New Customer============");		
			System.out.println("1) Citizen");
			System.out.println("2) Bussiness");
			System.out.println("3) Cancel");
			userOption= reader.readPositiveInt(":");
		}
		String fn,afm,pn,city,country;
		double discount;
		switch (userOption){		
		case 1:
			fn = reader.readString("Full Name:");
			afm = reader.readString("AFM:");
			pn = reader.readString("Phone Number:");
			city = reader.readString("City:");
			country = reader.readString("Country:");
			Citizens c = new Citizens(fn,afm,pn,city,country);
			company.addCustomer(c);
			System.out.println("Customer Added...");
			break;
		case 2:
			fn = reader.readString("Full Name:");
			afm = reader.readString("AFM:");
			pn = reader.readString("Phone Number:");
			city = reader.readString("City:");
			country = reader.readString("Country:");
			discount = reader.readPositiveFloat("Discount:");
			Bussiness b = new Bussiness(fn,afm,pn,city,country,discount);
			company.addCustomer(b);
			System.out.println("Customer Added...");
			break;
		case 3:
			break;			
		}
	}
	
	public void findVehicle(){				
		String key;			
		key = reader.readString("Vehicle's Licence:");					
		Vehicle v = company.searchForVehicle(key);
		if (v == null){
			System.out.println("Vehicle not Found");
		}else{
			v.print();
		}			
	}
	
	public void findCustomer(){				
		String key;			
		key = reader.readString("Customer AFM:");					
		Customer c = company.searchForCustomer(key);
		if (c == null){
			System.out.println("Customer not Found");
		}else{
			c.print();
		}			
	}
	
	int rentalcode = 107;
	public void addNewRental() throws ParseException, ClassNotFoundException {
		System.out.println("===========Insert New Rental============");
		String afm,licence,dod,dor;
		int tc = 0;
		double discount =0;
		afm = reader.readString("Customer's AFM:");
		Customer c = company.searchForCustomer(afm);
		licence = reader.readString("Vehicle's Licence:");
		Vehicle v = company.searchForVehicle(licence);
		dod = reader.readString("Date Of Delivery In Format YYYY/mm/DD:");
		dor = reader.readString("Date Of Return In Format YYYY/mm/DD:");
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    	Date DOD;
    	Date DOR;
        DOD = df.parse(dod);
        DOR = df.parse(dor);
        if(Class.forName("tuc.ece.cs102.company.model.Customer.Citizens").isInstance(c) && Class.forName("tuc.ece.cs102.company.model.Vehicle.Car").isInstance(v)) {
           Car c1 = (Car)v;
           if(c1.getMaxPass()>7)
        	   System.out.println("You Are Not Authorised To Rent A Public's Use Vehicle...");
           return;
        }
        try {
        if(Class.forName("tuc.ece.cs102.company.model.Customer.Bussiness").isInstance(c)) {
        	Bussiness b = (Bussiness)c; 
        	discount = b.getDiscount();
         }
        else {
        	discount = 0;
        }
        }catch(ClassNotFoundException ex){
        	System.out.println("Some error occured...");
        }
    	DatePeriod Days = new DatePeriod(DOD,DOR);
    	tc = (int) (Days.toDays()*v.getPrice());
    	tc = (int) (tc - ((discount/100)*tc));
    	Rental r = new Rental(++rentalcode,c,v,DOD,DOR,tc);
    	company.getRentals().insert(new RentalItem(r));
    	System.out.println("Rental added...");
    	
	}
	
	public void deleteVehicle() {
		String key;
		key = reader.readString("Vehicle's Licence You Want To Delete:");
		VehicleItem v = (VehicleItem)company.findVehicle(key);
		if(v == null) {
			System.out.println("Vehicle Not Found");
		}else {
			company.deleteVehicle(v);
			System.out.println("Vehicle deleted...");
		}
	}
	
	public void deleteCustomer() {
		String key;
		key = reader.readString("Customer's AFM You Want To Delete:");
		CustomerItem c = (CustomerItem)company.findCustomer(key);
		if(c == null) {
			System.out.println("Customer Not Found");
		}else {
			company.deleteCustomer(c);
			System.out.println("Customer deleted...");
		}
	}
	
	/*H methodos douleyei mono gia anazhthseis oxhmaton h pelaton pou exoume eisagei to Rental xeirokinhta kai oxi apo arxikopoihseis*/
	public void printRental() {
		    	System.out.println("Select from the choices below:");
		    	int c = reader.readPositiveInt("1:Vehicle's Licence  2:Customer's licence 3:Range OF Date :");
		    	switch(c) {
		    	  case 1:
		    		  String LC = reader.readString("Give the Vehicle's Licence:");
		    		  RentalItem r = company.searchForRental(LC);
		    		  if(r == null) {
		    			  System.out.println("Vehicle not found...");
		    		  }
		    		  else {
		    			  r.print();
		    		  }
		    		  break;
		    	 case 2:
		    		  String Afm = reader.readString("Give the Customer's Afm:");
		    		  RentalItem r1 = company.searchForRental(Afm);
		    		  if(r1 == null) {
		    			  System.out.println("Customer not found...");
		    		  }
		    		  else {
		    			  r1.print();
		    		  }
		    		break;
		    	  case 3:
		    		  //Range Of Dates
		    		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		    		  String date1 = reader.readString("Give One Date In Format(YYYY/MM/DD):");
		    		  String date2 = reader.readString("Give Another Date In Format(YYYY/MM/DD):");
		    		  LocalDate d1 = LocalDate.parse(date1,formatter);
		    		  LocalDate d2 = LocalDate.parse(date2,formatter);
		    		  for(LocalDate d=d1;d.isBefore(d2);d=d.plusDays(1)) {
		    			company.getRentals().getFirst();
		    
		    				  
		    			  }
		    			  /*for(int i=0;i<rental.size();i++) {
		    				  if(rental.get(i)!=null && rental.get(i).getDateOfDelivery().compareTo(java.sql.Date.valueOf(d))==0) {
		    					  rental.get(i).getRental();
		    				  }
		    			  }
		    		  }*/
		    		     		  
		    		  
		    	  }	
		 }
	
	public void printVehiclesByCategory() {
		String category = reader.readString("What kind of Vehicles you want to see? ");
		company.printVehiclesByCategory(category);
	}	
}
