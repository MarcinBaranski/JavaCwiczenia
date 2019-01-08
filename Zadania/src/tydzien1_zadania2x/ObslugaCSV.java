package tydzien1_zadania2x;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ObslugaCSV {

	// Standardowy separator pól w pliku CSV
	public static final char SEPARATOR = ';';

	public ArrayList<Ogloszenie> wczytajPlikCSV(File plik) {

		ArrayList<Ogloszenie> listaOgloszen = new ArrayList<Ogloszenie>();
		try {
			Scanner sc = new Scanner(plik);
			while (sc.hasNextLine()) {
				String linia = sc.nextLine();
				String[] pola = linia.split(";", -1);

				String typOgloszenia = pola[0];
				if (typOgloszenia.equals(Ogloszenie.OGL_STANDARD)) {

					Ogloszenie ogloszenie = new Ogloszenie(pola[2], pola[1], Double.parseDouble(pola[3]),
							Integer.parseInt(pola[4]));
					listaOgloszen.add(ogloszenie);
				} else if (typOgloszenia.equals(OgloszenieSamochodowe.OGL_SAMOCHODOWE)) {
					// Ogłoszenie samochodowe

					int przebieg = Integer.parseInt(pola[3]);
					int rokProd = Integer.parseInt(pola[4]);
					int pojemnosc = Integer.parseInt(pola[5]);
					int moc = Integer.parseInt(pola[6]);
					double cena = Double.parseDouble(pola[8]);
					int nrTel = Integer.parseInt(pola[9]);

					OgloszenieSamochodowe ogloszenieSamochodowe = new OgloszenieSamochodowe(pola[1], pola[2], rokProd,
							pojemnosc, przebieg, moc, pola[7], cena, nrTel);

					listaOgloszen.add(ogloszenieSamochodowe);

				} else if (typOgloszenia.equals(OgloszenieMieszkaniowe.OGL_MIESZKANIOWE)) {
					// Ogłoszenie mieszkaniowe
					int metraz = Integer.parseInt(pola[2]);
					int liczbaPokoi = Integer.parseInt(pola[3]);
					int nrPietra = Integer.parseInt(pola[4]);
					int rokBudowy = Integer.parseInt(pola[5]);
					double cena = Double.parseDouble(pola[6]);
					int nrTel = Integer.parseInt(pola[7]);

					OgloszenieMieszkaniowe ogloszenieMieszkaniowe = new OgloszenieMieszkaniowe(pola[1], metraz,
							liczbaPokoi, nrPietra, rokBudowy, cena, nrTel);
					listaOgloszen.add(ogloszenieMieszkaniowe);
				}

			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Wyjątek - nie znaleziono pliku.");
		}

		return listaOgloszen;
	}

	public void wpiszDoPlikuCSV(FileWriter writer, String[] dane, char separator) {

		boolean pierwszaLinia = true;
		StringBuilder stringBuilder = new StringBuilder();
		String pole = "";

		for (int i = 0; i < dane.length; i++) {
			pole = dane[i];

			if (pierwszaLinia != true) {
				stringBuilder.append(separator);
			}
			pierwszaLinia = false;
			stringBuilder.append(pole);
		}

		// Przejście do nowej lini po pojedyńczym ogłoszeniu
		stringBuilder.append("\n");

		// Zapis przygotowanej linii(ogłoszenia) do pliku
		try {
			writer.append(stringBuilder.toString());
		} catch (IOException e1) {
			System.out.println("Błąd wejścia do pliku CSV." + e1);
		} catch (NullPointerException e) {
			System.out.println("Błąd zapisu ogłoszenia do pliku ponieważ jest on używany przez inny proces " + e);
		}
	}

}
