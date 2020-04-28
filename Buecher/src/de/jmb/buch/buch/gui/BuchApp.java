package de.jmb.buch.buch.gui;
import de.jmb.buch.Buch;
import de.jmb.buch.db.BuchDb;

public class BuchApp {
	public static void main(String[] args) {
		Buch josef = new Buch("Mann", "Thomas", "Josef und seine Brüder");
		Buch HIV_J = new Buch("Mann", "Heinrich", "Die Jugend des Königs Henri Quatre");
		Buch HIV_V = new Buch("Mann", "Heinrich", "Die Vollendung des Königs Henri Quatre");
		Buch roth = new Buch("Roth", "Josef", "Radetzkymarsch");
		Buch bloch1 = new Buch("Bloch", "Joshua", "Effective Java. Programming Language Guide");
		Buch bloch2 = new Buch("Bloch", "Ernst", "Das Prinzip Hoffnung");

		System.out.println("" + josef);
		System.out.println("" + roth);
		System.out.println("" + bloch1);
		System.out.println("" + bloch2);
		System.out.println("" + HIV_J);
		System.out.println("" + HIV_V);

		BuchDb db = new BuchDb();

		// db.add

	}
}
