package tydzien1_zadania2x;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Przyklad_OgloszeniaZPliku {
	public static void main(String[] args) {

		ObslugaCSV obsl = new ObslugaCSV();

		String sciezka = "C:\\Users\\Marcin Barański\\Desktop\\Tmp\\ogloszenia.csv";
		File plik  = new File(sciezka);
		ArrayList<Ogloszenie> ogloszenia = obsl.wczytajPlikCSV(plik); 
		for (Ogloszenie ogloszenie : ogloszenia) {
			System.out.println(ogloszenie);
		}

	}

}
