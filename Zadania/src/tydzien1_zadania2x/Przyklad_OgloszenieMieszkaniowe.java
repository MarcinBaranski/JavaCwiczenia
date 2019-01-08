package tydzien1_zadania2x;

import java.util.ArrayList;
import java.util.List;

public class Przyklad_OgloszenieMieszkaniowe {

	public static void main(String[] args) {

		OgloszenieMieszkaniowe ogloszenieLegionowo = new OgloszenieMieszkaniowe("Legionowo", 75 , 3, 2, 2000,350_000.00,876765432);
		// Ogloszenie ogloszenie1 = new Ogloszenie("Laptop Dell", "I5 , 4GB RAM , grfika
		// Radeon ", 2599.99, 532_643_746);

		List<OgloszenieMieszkaniowe> ogloszeniaMieszkaniowe = new ArrayList<OgloszenieMieszkaniowe>();
		ogloszeniaMieszkaniowe.add(ogloszenieLegionowo);
		ogloszeniaMieszkaniowe.add( new OgloszenieMieszkaniowe("Mieszkanie Łódz", "nowe budownictwo, winda, dobrze nasłonecznione", 250000.00, 557_123_123));
		//ogloszeniaMieszkaniowe.add(new OgloszenieSamochodowe("Kia", "Ceed", 2010, 2000, 120000, 150, "benzyna"));
		ogloszeniaMieszkaniowe.add(new OgloszenieMieszkaniowe("Warszawa", 65, 2 ,5, 2013,400_000.00,645756876));

		System.out.println("Liczba ogloszeń: " + ogloszeniaMieszkaniowe.size());

		for (int i = 0; i < ogloszeniaMieszkaniowe.size(); i++) {
			System.out.println(ogloszeniaMieszkaniowe.get(i));
			System.out.println(ogloszeniaMieszkaniowe.get(i).typOgloszenia());
		}
		try {
			ogloszeniaMieszkaniowe.get(2);
		} catch (Exception e) {
			System.out.println("Odczyt danych z listy zwrócił błąd : " + e.getClass());
		}

//		System.out.println(ogloszenia);

	}

}
