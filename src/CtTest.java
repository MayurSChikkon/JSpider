class Ticket {

}

class Conductor {
	Ticket issues() {
		Ticket t = new Ticket();
		System.out.println("Conductor issues ticket");
		return t;
	}
}

public class CtTest {

	public static void main(String[] args) {
		Conductor c = new Conductor();
		c.issues();
	}
}
