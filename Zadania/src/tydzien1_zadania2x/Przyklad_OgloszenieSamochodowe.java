package tydzien1_zadania2x;

import java.util.ArrayList;
import java.util.List;

public class Przyklad_OgloszenieSamochodowe {

	public static void main(String[] args) {

		OgloszenieSamochodowe ogloszenieBmw = new OgloszenieSamochodowe("Bmw", "sprowadzone z Niemiec, pierwszy właściciel w kraju",
				32599.99, 664_926_746);
		// Ogloszenie ogloszenie1 = new Ogloszenie("Laptop Dell", "I5 , 4GB RAM , grfika
		// Radeon ", 2599.99, 532_643_746);

		List<Ogloszenie> ogloszeniaSamochodowe = new ArrayList<Ogloszenie>();
		ogloszeniaSamochodowe.add(ogloszenieBmw);
		ogloszeniaSamochodowe.add(new Ogloszenie("Samochód Audi", "pierwszy właściciel, kolor granatowy", 22599.99, 557_123_123));
		ogloszeniaSamochodowe.add(new OgloszenieSamochodowe());
		ogloszeniaSamochodowe.add(new OgloszenieSamochodowe("Kia", "Ceed", 2010, 2000, 120000, 150, "benzyna",25000.00,876_765_876));

		System.out.println("Liczba ogloszeń: " + ogloszeniaSamochodowe.size());

		for (int i = 0; i < ogloszeniaSamochodowe.size(); i++) {
			System.out.println(ogloszeniaSamochodowe.get(i));
			System.out.println(ogloszeniaSamochodowe.get(i).typOgloszenia());
		}
		try {
			ogloszeniaSamochodowe.get(2);
		} catch (Exception e) {
			System.out.println("Odczyt danych z listy zwrócił błąd : " + e.getClass());
		}

//		System.out.println(ogloszenia);

	}

}
