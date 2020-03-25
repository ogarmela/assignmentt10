
public class ticket {
	private int number;

	  public Ticket(int number) {
	    this.number = number;
	  }

	  public double getPrice() {
	    return 50.0;
	  }

	  public String toString() {
	     return "Ticket #" + this.number + ", Price: $" + this.getPrice();
	  }


}
