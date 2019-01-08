package tydzien1_zadania2x;

import java.util.ArrayList;
import java.util.List;

public class Przyklad_Ogloszenie {

	public static void main(String[] args) {

		Ogloszenie ogloszenie = new Ogloszenie("Laptop Lenovo", "I7 , 8GB RAM , grafika Radeon", 3599.99, 532_643_746);
		// Ogloszenie ogloszenie1 = new Ogloszenie("Laptop Dell", "I5 , 4GB RAM , grfika
		// Radeon ", 2599.99, 532_643_746);

		List<Ogloszenie> ogloszenia = new ArrayList<Ogloszenie>();
		ogloszenia.add(ogloszenie);
		ogloszenia.add(new Ogloszenie("Laptop Dell", "I5 , 4GB RAM , grafika Nvidia", 2599.99, 557_123_826));
		ogloszenia.add(new Ogloszenie());

		System.out.println("Liczba ogloszeń: " + ogloszenia.size());

		for (int i = 0; i < 3; i++) {
			System.out.println(ogloszenia.get(i));
		}
		try {
			ogloszenia.get(2);
		} catch (Exception e) {
			System.out.println("Odczyt danych z listy zwrócił błąd : " + e.getClass());
		}

//		System.out.println(ogloszenia);

	}

}
