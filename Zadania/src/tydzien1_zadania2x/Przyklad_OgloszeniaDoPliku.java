package tydzien1_zadania2x;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Przyklad_OgloszeniaDoPliku {
	public static void main(String[] args) {

//		FileWriter writer = null;
//		ObslugaCSV obsl = new ObslugaCSV();

		ArrayList<Ogloszenie> ogloszenia = new ArrayList<Ogloszenie>();
		
		// Zwykle ogloszenia
		ogloszenia.add(new Ogloszenie("Laptop Lenovo", "I7 , 8GB RAM , grafika Radeon", 3599.99, 532_643_746));
		ogloszenia.add(new Ogloszenie("Laptop Dell", "I5 , 4GB RAM , grafika Nvidia", 2599.99, 557_123_826));

		// Ogloszenia Samochodowe
		ogloszenia.add(new OgloszenieSamochodowe("Audi","A6", 2014, 2500, 200000, 220, "diesel",65300.55,123_234_345));
		ogloszenia.add(new OgloszenieSamochodowe("Kia","Ceed", 2010, 2000, 120000, 150, "benzyna",25000.00,987_876_654));

		// Ogloszenia mieszkaniowe
		ogloszenia.add(new OgloszenieMieszkaniowe("Łodz", 55, 3, 4, 2000,300_000.00,654_654_654));
		ogloszenia.add(new OgloszenieMieszkaniowe("Warszawa", 65, 2, 5, 2013,400_000.00,666_777_888));

		String sciezkaDoPliku = "C:\\Users\\Marcin Barański\\Desktop\\Tmp\\ogloszenia.csv";
		
		wpiszListeOgloszenDoPliku(sciezkaDoPliku,ogloszenia);

	}

public static void wpiszListeOgloszenDoPliku(String sciezkaPliku, ArrayList<Ogloszenie> listaogloszen) {
		
		FileWriter writer = null;
		ObslugaCSV obsluga = new ObslugaCSV();
		
		try {
//			writer = new FileWriter("C:\\Users\\Marcin Barański\\Desktop\\Tmp\\ogloszenia.csv");
			writer = new FileWriter(sciezkaPliku);
		} catch (IOException e) {
			// Błąd otwarcia pliku csv
			System.out.println("Błąd otwarcia pliku csv: " + e);
		}

		for (int i = 0; i < listaogloszen.size(); i++) {
			if (listaogloszen.get(i).typOgloszenia().equals(Ogloszenie.OGL_STANDARD)) {
				// Ogłoszenie standardowe
				String[] dane = new String[5];
				dane[0] = listaogloszen.get(i).typOgloszenia();
				dane[1] = listaogloszen.get(i).getTytul();
				dane[2] = listaogloszen.get(i).getOpis();
				dane[3] = Double.toString(listaogloszen.get(i).getCena());
				dane[4] = Integer.toString(listaogloszen.get(i).getNrTel());

				obsluga.wpiszDoPlikuCSV(writer, dane, obsluga.SEPARATOR);

			} else if (listaogloszen.get(i).typOgloszenia().equals(OgloszenieSamochodowe.OGL_SAMOCHODOWE)) {
				// Ogłoszenie samochodowe
				String[] dane = new String[10];
				dane[0] = ((OgloszenieSamochodowe) listaogloszen.get(i)).typOgloszenia();
				dane[1] = ((OgloszenieSamochodowe) listaogloszen.get(i)).getMarka();
				dane[2] = ((OgloszenieSamochodowe) listaogloszen.get(i)).getModel();
				dane[3] = Integer.toString(((OgloszenieSamochodowe) listaogloszen.get(i)).getPrzebieg());
				dane[4] = Integer.toString(((OgloszenieSamochodowe) listaogloszen.get(i)).getRokProd());
				dane[5] = Integer.toString(((OgloszenieSamochodowe) listaogloszen.get(i)).getPojemnosc());
				dane[6] = Integer.toString(((OgloszenieSamochodowe) listaogloszen.get(i)).getMoc());
				dane[7] = (((OgloszenieSamochodowe) listaogloszen.get(i)).getRodzajPaliwa());
				dane[8] = Double.toString(((OgloszenieSamochodowe) listaogloszen.get(i)).getCena());
				dane[9] = Integer.toString(((OgloszenieSamochodowe) listaogloszen.get(i)).getNrTel());

				obsluga.wpiszDoPlikuCSV(writer, dane, obsluga.SEPARATOR);

			} else if (listaogloszen.get(i).typOgloszenia().equals(OgloszenieMieszkaniowe.OGL_MIESZKANIOWE)) {
				// Ogłoszenie mieszkaniowe
				String[] dane = new String[8];
				dane[0] = ((OgloszenieMieszkaniowe) listaogloszen.get(i)).typOgloszenia();
				dane[1] = ((OgloszenieMieszkaniowe) listaogloszen.get(i)).getMiejscowosc();
				dane[2] = Integer.toString(((OgloszenieMieszkaniowe) listaogloszen.get(i)).getMetraz());
				dane[3] = Integer.toString(((OgloszenieMieszkaniowe) listaogloszen.get(i)).getLiczbaPokoi());
				dane[4] = Integer.toString(((OgloszenieMieszkaniowe) listaogloszen.get(i)).getNrPietra());
				dane[5] = Integer.toString(((OgloszenieMieszkaniowe) listaogloszen.get(i)).getRokBudowy());
				dane[6] = Double.toString(((OgloszenieMieszkaniowe) listaogloszen.get(i)).getCena());
				dane[7] = Integer.toString(((OgloszenieMieszkaniowe) listaogloszen.get(i)).getNrTel());

				obsluga.wpiszDoPlikuCSV(writer, dane, obsluga.SEPARATOR);
			}

		}

		if (listaogloszen.size() == 1) {
			System.out.println("Zapisano do pliku " + listaogloszen.size() + " ogłoszenie.");
		} else if (listaogloszen.size() == 2 || listaogloszen.size() == 3 || listaogloszen.size() == 4) {
			System.out.println("Zapisano do pliku " + listaogloszen.size() + " ogłoszenia.");
		} else {
			System.out.println("Zapisano do pliku " + listaogloszen.size() + " ogłoszeń.");
		}

		try {
			writer.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Błąd wyczyszczenia uchwytu do pliku");
		}
		try {
			writer.close();
		} catch (Exception e) {
			System.out.println("Błąd zamknięcia dostepu do pliku");
		}
		
		
	}

}
