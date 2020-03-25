
public class advancedticket {
	private int daysAhead;

	  public AdvanceTicket(int number, int daysAhead) {
	    super(number);
	    this.daysAhead = daysAhead;
	  }

	  public double getPrice() {
	    if (daysAhead >= 10) {
	      return 30.00;
	    } else {
	      return 40.00;
	    }
	  }

	  public String toString() {
	    if (daysAhead >= 10) {
	      return super.toString() + " (" + this.daysAhead + " days ahead, you got a great deal!)";
	    } else {
	      return super.toString() + " (" + this.daysAhead + " days ahead, you could have saved a bit more)";
	    }
	  }


}
