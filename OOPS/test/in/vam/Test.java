package in.vam;

import in.vamsoft.SportsCar;

public class Test {

	public static void main(String[] args) {
	
		SportsCar ob=new SportsCar("suv");
		System.out.println(ob);
		ob.handbrake();
		ob.fourwheeler();
	}

}
