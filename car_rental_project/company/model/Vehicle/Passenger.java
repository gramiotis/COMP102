package tuc.ece.cs102.company.model.Vehicle;

public abstract class Passenger extends Vehicle{
	
	private int maxPass;
	private int cc;
	
	public Passenger(String licence,String Brand,String dor,int totaldistance,double price,int maxPass,int cc) {
		super(licence,Brand,dor,totaldistance,price);
		this.maxPass = maxPass;
		this.cc = cc;
	}

	public int getMaxPass() {
		return maxPass;
	}

	public void setMaxPass(int maxPass) {
		this.maxPass = maxPass;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public abstract void print();

	@Override
	public abstract String toString();

}
