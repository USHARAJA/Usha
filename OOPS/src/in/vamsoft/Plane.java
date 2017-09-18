package in.vamsoft;

public class Plane extends Vehicle implements Flying {

	public Plane() {
		System.out.println("Plane.Plane()");
	}
	public static void main(String[] args) {
		System.out.println("Plane.main()");
	}

	@Override
	public void takeOff() {
		System.out.println("Plane.takeOff()");
		
	}

	@Override
	public void land() {
		System.out.println("Plane.land()");
	}

	@Override
	public void start() {
	System.out.println("Plane.start()");	
	}

	@Override
	public void stop() {System.out.println("Plane.stop()");
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

}
