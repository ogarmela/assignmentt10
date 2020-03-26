
public class studentadevancedticket {
	  public StudentAdvanceTicket(int number, int daysAhead) {
		    super(number, daysAhead);
		    super.price = super.getPrice() / 2;
		  }

		  public String toString() {
		    return super.toString() + " (ID Required) ";
		  }


}
