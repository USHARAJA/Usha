package in.vamsoft;

public abstract class Vehicle implements Driving {
	public Vehicle() {
		// TODO Auto-generated constructor stub
		System.out.println("Vehical.Vehical()");
	}
	
	
	public abstract void start();
	
	public abstract void stop();
	
	public abstract void brake();

}
