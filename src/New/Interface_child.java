package New;

public class Interface_child implements Interface_parent {
	
	public  void car() {
		System.out.println("new car");
	}
	 
	public void bike() {
		System.out.println("i am bike");
	}
	
	public void cycle() {
		System.out.println("i am cycle");
	}
	
	public  void fortuner() {
		System.out.println("i am fortuner");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_child i= new Interface_child();
		i.car();
		i.bike();
		i.cycle();
		i.fortuner();
		
	}

}
