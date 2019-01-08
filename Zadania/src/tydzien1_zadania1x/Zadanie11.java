package tydzien1_zadania1x;

import java.util.Random;

import javax.swing.JOptionPane;

public class Zadanie11 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Let's play a game. Guess a random number from 0 to 999.");

		Random rnd = new Random();
		int random = rnd.nextInt(1000);
		int liczbaInt;

		boolean nieOdganieto = true;
		while (nieOdganieto == true) {
			String liczbaStr = "";
			try {
				liczbaStr = JOptionPane.showInputDialog("Zgaduj liczbę z zakresu od 0 do 999:");
				Integer.parseInt(liczbaStr);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Podano błędną wartość. Spróbuj ponownie.");
				continue;
			}

			liczbaInt = Integer.parseInt(liczbaStr);
			if (random == liczbaInt) {
				nieOdganieto = false;
				JOptionPane.showMessageDialog(null, "Brawo odgadłeś. Zgadywana liczba to : " + liczbaInt);
			} else if (random > liczbaInt) {
				JOptionPane.showMessageDialog(null,
						"Nie odgadłeś szukanej wartości. Zgadywana liczba jest większa niż " + liczbaInt);
				nieOdganieto = true;
			} else {
				JOptionPane.showMessageDialog(null,
						"Nie odgadłeś szukanej wartości. Zgadywana liczba jest mniejsza niż " + liczbaInt);
				nieOdganieto = true;
			}
		}

	}

}
