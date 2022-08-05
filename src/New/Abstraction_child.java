package New;

public class Abstraction_child extends Abstraction_parent { 
	
void car() {
	System.out.println("i am car");
}

void bike() {
	System.out.println("i am bike");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction_child a= new Abstraction_child();
		
		a.car();
		a.bike();
	}

}
