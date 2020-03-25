import sun.security.krb5.internal.Ticket;

public class ticketmain {
	public static void main(String[] args) {
	      Ticket[] tickets = new Ticket[5];
	      tickets[0] = new WalkupTicket(1);
	      tickets[1] = new AdvanceTicket(2,12);
	      tickets[2] = new AdvanceTicket(3,8);
	      tickets[3] = new StudentAdvanceTicket(4,17);
	      tickets[4] = new StudentAdvanceTicket(5,7);

	      for (int i = 0; i<5; i++) {
	         System.out.println(tickets[i]);
	         //System.out.println(" ");
	      }
	   }

}
