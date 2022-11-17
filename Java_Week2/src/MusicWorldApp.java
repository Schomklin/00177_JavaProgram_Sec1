import javax.swing.*;

public class MusicWorldApp {
	static final double TAX_RATE = 0.0625;

	public static void main(String[] args) {
		// declare and initialize variables
		String openingMessage = "This progeam calculates the total cost of a CD order",
				idMessage = "Please enter the ID of the CD", titleMessage = "Please enter the title of the CD",
				priceMessage = "Please enter the price of the CD in U.S. dollars",
				quantityMessage = "Please enter the quantity to be purchased",
				outputMessage;
		int cdQuantity;
		double cdPrice, cdSubtotal, cdTotal;

		// input
		String cdID = JOptionPane.showInputDialog(openingMessage + "\n" + idMessage);
		String cdTitle = JOptionPane.showInputDialog(titleMessage);
		cdPrice = Double.parseDouble(JOptionPane.showInputDialog(priceMessage));
		cdQuantity = Integer.parseInt(JOptionPane.showInputDialog(quantityMessage));
		String taxRateStr = 100 * TAX_RATE + "%"; // string to display tax rate

		// calculate
		cdSubtotal = cdPrice * cdQuantity;
		cdTotal = cdSubtotal * (1 + TAX_RATE);
		
		//output
		outputMessage = "Summary of the transaction:\n\n"
				+ "CD ID: " + cdID +"\n"
				+ "CD Title: "+cdTitle +"\n"
				+ "CD Unit Price: $"+cdPrice+"\n"
				+ "CD Quantity: "+cdQuantity+"\n\n"
				+ "Subtotal: $"+cdSubtotal+"\n"
				+ "Tax rate: "+taxRateStr+"\n"
				+ "Total: $"+cdTotal+"\n\n"
				+ "End of Program ";
		JOptionPane.showMessageDialog(null, outputMessage);

	}

}
