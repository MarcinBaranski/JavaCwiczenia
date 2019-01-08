package tydzien1_zadania2x;

import java.util.ArrayList;
import java.util.List;

public class Przyklad_OgloszeniaWszystkie {

	public static void main(String[] args) {

		List<Ogloszenie> ogloszenia = new ArrayList<Ogloszenie>();

		// Zwykle ogloszenia
		ogloszenia.add(new Ogloszenie("Laptop Lenovo", "I7 , 8GB RAM , grafika Radeon", 3599.99, 532_643_746));
		ogloszenia.add(new Ogloszenie("Laptop Dell", "I5 , 4GB RAM , grafika Nvidia", 2599.99, 557_123_826));

		// Ogloszenia Samochodowe
		ogloszenia
				.add(new OgloszenieSamochodowe("Audi", "pierwszy właściciel, kolor granatowy", 22599.99, 557_123_123));
		ogloszenia
				.add(new OgloszenieSamochodowe("Kia", "Ceed", 2010, 2000, 120000, 150, "benzyna", 25000.00, 123234345));

		// Ogloszenia mieszkaniowe
		ogloszenia.add(new OgloszenieMieszkaniowe("Mieszkanie w mieście Łódz, ",
				"nowe budownictwo, winda, dobrze nasłonecznione", 250000.00, 557_123_123));
		ogloszenia.add(new OgloszenieMieszkaniowe("Warszawa", 65, 2, 5, 2013, 400_000.00, 234_123_234));

		System.out.println("Liczba ogloszeń: " + ogloszenia.size());

		try {
			for (int i = 0; i < 7; i++) {

				if (i % 2 == 0 && i != 1) { // Dodatkowa pusta linia co 2 ogloszenie
					System.out.println();
				}
				System.out.println(ogloszenia.get(i));
			}
		} catch (Exception e) {
			System.out.println("Odczyt danych z listy zwrócił błąd : " + e.getClass());
		}

	}

}
