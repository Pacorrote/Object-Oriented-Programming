package case_problems_c2.tickets;

public class TicketNumber {
	private Integer numberTicket;
	public TicketNumber() {
		// TODO Auto-generated constructor stub
	}
	public Integer getNumberTicket() {
		return numberTicket;
	}
	public void setNumberTicket(Integer numberTicket) {
		this.numberTicket = numberTicket;
	}
	private static Integer rLastDigit(TicketNumber ticket) {
		return ticket.getNumberTicket()/10;
	}
	private static Integer lastDigit(TicketNumber numero) {
		return numero.getNumberTicket()%10;
	}
	public Boolean comparison(TicketNumber ticket) {
		return ticket.rLastDigit(ticket)%7==ticket.lastDigit(ticket);
	}
}
