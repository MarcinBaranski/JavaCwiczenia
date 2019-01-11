package tydzien1_zadania3x;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Zadanie32 {

	public static void main(String[] args) {
		
//		String pathName = "C:\\Users\\Marcin Barański\\Desktop\\Nauka\\Java-ALX\\Pendrive\\Zjazd 1\\Test.txt";
		String pathName = "C:\\Users\\Marcin Barański\\Desktop\\Nauka\\Java-ALX\\Pendrive\\Zjazd 1\\pan-tadeuszKrotki.txt";
		File plik = new File(pathName);
		zliczSlowaWTekscie(plik);
		
		

	}
	
	public static void zliczSlowaWTekscie(File plik) {
		TreeMap<String, Integer > mapa = new TreeMap<String, Integer>();
		Scanner sc = null;
		
		try {
			sc = new Scanner(plik);
		} catch (FileNotFoundException e) {

			System.out.println("Nie znaleziono wymaganego pliku "+ plik.getName());
		}
		
		sc.useDelimiter("[^\\p{L}]+");
		
		while(sc.hasNext()) {
			String slowo = sc.next();

			// Dodanie wpisu(slowo,ilosc+1) do mapa jezeli wpis istnial lub utworzenie wpisu z wartoscia początkową 1
			mapa.merge(slowo, 1, Math::addExact);
			
			//Sortowanie po wartościach rosnąco 
			Stream<Map.Entry<String,Integer>> sorted =
					mapa.entrySet().stream()
						.sorted(Map.Entry.comparingByValue());
			
		}
		
		sc.close();

		//Drukwoanie mapy bez sortowania po wartości
		
//		for (Map.Entry<String, Integer> mapa_element : mapa.entrySet()) {
//			System.out.println(mapa_element.getKey() + " -> " + mapa_element.getValue());
//		}
		
		//Drukowanie mapy posortowanej po wartościach
		
		mapa.entrySet().stream()
			.sorted(Map.Entry.comparingByValue())
				.forEach(System.out::println);
		
	}

}
