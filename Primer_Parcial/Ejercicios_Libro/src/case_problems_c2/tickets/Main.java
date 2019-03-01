package case_problems_c2.tickets;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		String numero =JOptionPane.showInputDialog(null, "Numero del ticket");
		number = Integer.parseInt(numero);
		TicketNumber ticket = new TicketNumber();
		ticket.setNumberTicket(number);
		JOptionPane.showMessageDialog(null, ticket.comparison(ticket));
	}

}
