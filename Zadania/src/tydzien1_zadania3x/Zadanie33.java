package tydzien1_zadania3x;

public class Zadanie33 {

	public static void main(String[] args) {

		testy();

	}

	public static String wartoscTekstowa(long liczba) {

		String liczbaTekstowo = "";

		String setki[] = { "zero", "sto ", "dwieście ", "trzysta ", "czterysta ", "pięćset ", "sześćset ", "siedemset ",
				"osiemset ", "dziewięćset " };

		String dziesiatki[] = { "zero", "dziesięć ", "dwadzieścia ", "trzydzieści ", "czterdzieści ", "pięćdziesiąt ",
				"sześćdziesiąt ", "siedemdziesiąt ", "osiemdziesiąt ", "dziewięćdziesiąt " };

		String ponizej20[] = { "zero", "jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem", "dziewięć",
				"dziesięć", "jedenaście", "dwanaście", "trzynaście", "czternaście", "piętnaście", "szesnaście",
				"siedemnaście", "osiemnaście", "dziewiętnaście" };

		if (liczba == 0) {
			return "zero";
		}

//		String tmp = String.valueOf(liczba).substring(0, 1);
		// Zabezpieczenie przed zerem na początku long'a
//		if (tmp.equals("0")) {
//			System.out.println("Błędna wartość liczby. Liczba nie może zaczynac sie od zera.");
//		}

		if (liczba < 0) {
			String liczbaString = "" + liczba;
			liczbaString = liczbaString.substring(1);
			return "minus " + wartoscTekstowa(Long.parseLong(liczbaString));
		}

		// Miliardy
		if ((liczba / 1_000_000_000) > 0) {

			liczbaTekstowo = obslugaKonwersji(liczba, 1_000_000_000, "miliard", "miliardy", "miliardów",
					liczbaTekstowo);
			liczba %= 1_000_000_000;
		}

		// Miliony

		if ((liczba / 1_000_000) > 0) {

//			int wynik = dobierzPrzedrostek(liczba, 1_000_000);
//			int pomocnicza = (wynik % 100);
//			String wynikStr = Integer.toString(pomocnicza);
//			int ostatniaCyfra = Integer.parseInt(wynikStr.substring(wynikStr.length() - 1, wynikStr.length()));
//
//			if (wynik == 1) {
//				liczbaTekstowo += "milion ";
//			} else if (pomocnicza > 5 && pomocnicza < 21) {
//				liczbaTekstowo += wartoscTekstowa(wynik) + " milionów ";
//			} else if ((ostatniaCyfra == 2 || ostatniaCyfra == 3 || ostatniaCyfra == 4)) {
//				liczbaTekstowo += wartoscTekstowa(wynik) + " miliony ";
//			} else  {
//				liczbaTekstowo += wartoscTekstowa(wynik) + " milionów ";
//			}
			liczbaTekstowo = obslugaKonwersji(liczba, 1_000_000, "milion", "miliony", "milionów", liczbaTekstowo);
			liczba %= 1_000_000;
		}

		// Tysiące
		if ((liczba / 1_000) > 0) {
//			int wynik = dobierzPrzedrostek(liczba, 1000);	// ile jest tysiecy (1 tysiac, 2 tysiace,13 tysiecy, 21 tysiecy itd...)
//			int pomocnicza = (wynik % 100);					// wartość z dzielenia ilości tysięcy przez 100 -  na potrzeby dobrania odpowiedniej formy  tysięcy lub tysiące
//			String wynikStr = Integer.toString(pomocnicza);	// rzutowanie na Stringa
//			int ostatniaCyfra = Integer.parseInt(wynikStr.substring(wynikStr.length() - 1, wynikStr.length()));	// ostatnia cyfra zrzutowanej wartości na Stringa
//
//			if (wynik == 1) {
//				liczbaTekstowo += "tysiąc ";
//			}
//			else if (pomocnicza > 5 && pomocnicza < 21) {
//				liczbaTekstowo += wartoscTekstowa(wynik) + " tysięcy ";
//			}
//			else if ((ostatniaCyfra == 2 || ostatniaCyfra == 3 || ostatniaCyfra == 4)) {
//				liczbaTekstowo += wartoscTekstowa(liczba / 1000) + " tysiące ";
//			} else {
//				liczbaTekstowo += wartoscTekstowa(wynik) + " tysięcy ";
//			}
//
//			liczba %= 1_000;
			liczbaTekstowo = obslugaKonwersji(liczba, 1000, "tysiąc", "tysiące", "tysięcy", liczbaTekstowo);
			liczba %= 1000;
		}

		// Setki
		if ((liczba / 100) > 0) {
			long tmp = dobierzPrzedrostek(liczba, 100);
			liczbaTekstowo += setki[(int) tmp];
			liczba %= 100;
		}

		// Dziesiątki i naście
		if (liczba > 0) {
			if (liczba < 20) {
				liczbaTekstowo += ponizej20[(int) liczba];
			} else {
				liczbaTekstowo += dziesiatki[(int) liczba / 10];
				if ((liczba % 10) > 0) {
					liczbaTekstowo += ponizej20[(int) liczba % 10];
				}

			}
		}
		return liczbaTekstowo;
	}

	public static long dobierzPrzedrostek(long liczba, long dzielnik) {

		long wyn = liczba / dzielnik;

		return wyn;
	}

	public static String obslugaKonwersji(long liczba, long dzielnik, String formaDlaJednego, String formaDlaDwojki,
			String formaDlaWielu, String tekstWynikowy) {

		long wynik = dobierzPrzedrostek(liczba, dzielnik); // ile jest tysiecy (1 tysiac, 2 tysiace,13 tysiecy, 21
															// tysiecy itd...)
		long pomocnicza = (wynik % 100); // wartość z dzielenia ilości tysięcy przez 100 - na potrzeby dobrania
											// odpowiedniej formy tysięcy lub tysiące
		String wynikStr = Long.toString(pomocnicza); // rzutowanie na Stringa
		int ostatniaCyfra = Integer.parseInt(wynikStr.substring(wynikStr.length() - 1, wynikStr.length())); // ostatnia cyfra zrzutowanej wartośći na Stringa

		if (wynik == 1) {
			tekstWynikowy += formaDlaJednego + " ";
		} else if (pomocnicza > 5 && pomocnicza < 21) {
			tekstWynikowy += wartoscTekstowa(wynik) + " " + formaDlaWielu + " ";
		} else if ((ostatniaCyfra == 2 || ostatniaCyfra == 3 || ostatniaCyfra == 4)) {
			tekstWynikowy += wartoscTekstowa(wynik) + " " + formaDlaDwojki + " ";
		} else {
			tekstWynikowy += wartoscTekstowa(wynik) + " " + formaDlaWielu + " ";
		}
		return tekstWynikowy;
	}

	public static void testy() {
		// TESTY

		// Testy SETKI
		System.out.println(wartoscTekstowa(39));
		System.out.println(wartoscTekstowa(56));
		System.out.println(wartoscTekstowa(89));
		System.out.println(wartoscTekstowa(99));
		System.out.println(wartoscTekstowa(100));
		System.out.println(wartoscTekstowa(102));
		System.out.println(wartoscTekstowa(110));
		System.out.println(wartoscTekstowa(116));
		System.out.println(wartoscTekstowa(121));
		System.out.println(wartoscTekstowa(122));
		System.out.println(wartoscTekstowa(123));
		System.out.println(wartoscTekstowa(124));
		System.out.println(wartoscTekstowa(147));
		System.out.println(wartoscTekstowa(168));
		System.out.println(wartoscTekstowa(199));
		System.out.println(wartoscTekstowa(200));
		System.out.println(wartoscTekstowa(202));
		System.out.println(wartoscTekstowa(210));
		System.out.println(wartoscTekstowa(216));
		System.out.println(wartoscTekstowa(299));
		System.out.println(wartoscTekstowa(324));
		System.out.println(wartoscTekstowa(368));
		System.out.println(wartoscTekstowa(447));

		// Testy TYSIACE
		System.out.println(wartoscTekstowa(3123));
		System.out.println(wartoscTekstowa(4123));
		System.out.println(wartoscTekstowa(5123));
		System.out.println(wartoscTekstowa(6123));
		System.out.println(wartoscTekstowa(7123));
		System.out.println(wartoscTekstowa(8123));
		System.out.println(wartoscTekstowa(9123));
		System.out.println(wartoscTekstowa(10123));
		System.out.println(wartoscTekstowa(11123));
		System.out.println(wartoscTekstowa(12123));
		System.out.println(wartoscTekstowa(21123));
		System.out.println();

		System.out.println(wartoscTekstowa(101123));
		System.out.println(wartoscTekstowa(303123));
		System.out.println(wartoscTekstowa(324423));
		System.out.println(wartoscTekstowa(413123));
		System.out.println(wartoscTekstowa(512123));
		System.out.println(wartoscTekstowa(619123));
		System.out.println(wartoscTekstowa(901123));
		System.out.println(wartoscTekstowa(983723));
		System.out.println(wartoscTekstowa(985555));
		System.out.println(wartoscTekstowa(999123));

//		System.out.println(wartoscTekstowa(01123));			//Błąd bo zero na początku - dziwnie czyta liczbe - do sprawdzenia

		// Testy MILIONY
		System.out.println(wartoscTekstowa(1000000));
		System.out.println(wartoscTekstowa(1000001));
		System.out.println(wartoscTekstowa(1100000));
		System.out.println(wartoscTekstowa(1111111));
		System.out.println(wartoscTekstowa(1231567));
		System.out.println(wartoscTekstowa(1232567));
		System.out.println(wartoscTekstowa(1233567));
		System.out.println(wartoscTekstowa(1234567));
		System.out.println(wartoscTekstowa(2000000));
		System.out.println(wartoscTekstowa(2000354));
		System.out.println(wartoscTekstowa(2425562));
		System.out.println(wartoscTekstowa(12429872));
		System.out.println(wartoscTekstowa(14429872));
		System.out.println(wartoscTekstowa(15829872));
		System.out.println(wartoscTekstowa(20429872));
		System.out.println(wartoscTekstowa(21429872));
		System.out.println(wartoscTekstowa(88_429_872));
		System.out.println();

		System.out.println(wartoscTekstowa(112_429_872));
		System.out.println(wartoscTekstowa(107_429_872));
		System.out.println(wartoscTekstowa(103_429_872));
		System.out.println(wartoscTekstowa(105_429_872));
		System.out.println(wartoscTekstowa(114_429_872));
		System.out.println(wartoscTekstowa(117_429_872));
		System.out.println(wartoscTekstowa(119_429_872));
		System.out.println(wartoscTekstowa(120_429_872));
		System.out.println(wartoscTekstowa(124_429_872));
		System.out.println(wartoscTekstowa(126_429_872));
		System.out.println(wartoscTekstowa(545_429_872));
		System.out.println(wartoscTekstowa(666_429_872));
		System.out.println(wartoscTekstowa(999_429_872));

		// Testy MILIARDY
		System.out.println(wartoscTekstowa(1_000_000_137));
		System.out.println(wartoscTekstowa(1_000_001_137));
		System.out.println(wartoscTekstowa(1_100_000_137));
		System.out.println(wartoscTekstowa(1_111_111_137));
		System.out.println(wartoscTekstowa(1_231_567_137));
		System.out.println(wartoscTekstowa(1_232_567_123));
		System.out.println(wartoscTekstowa(1_233_567_123));
		System.out.println(wartoscTekstowa(1_234_567_123));
		System.out.println(wartoscTekstowa(2_000_000_123));
		System.out.println(wartoscTekstowa(2_000_354_765));
		System.out.println(wartoscTekstowa(2_425_562_765L));
		System.out.println(wartoscTekstowa(12_429_872_765L));
		System.out.println(wartoscTekstowa(14_429_872_765L));
		System.out.println(wartoscTekstowa(15_829_872_765L));
		System.out.println(wartoscTekstowa(20_429_872_765L));
		System.out.println(wartoscTekstowa(21_429_872_765L));
		System.out.println(wartoscTekstowa(88_429_872_765L));
		System.out.println();

		System.out.println(wartoscTekstowa(112_429_872_765L));
		System.out.println(wartoscTekstowa(107_429_872_234L));
		System.out.println(wartoscTekstowa(103_429_872_456L));
		System.out.println(wartoscTekstowa(105_429_872_647L));
		System.out.println(wartoscTekstowa(114_429_872_101L));
		System.out.println(wartoscTekstowa(117_429_872_258L));
		System.out.println(wartoscTekstowa(119_429_872_816L));
		System.out.println(wartoscTekstowa(120_429_872_273L));
		System.out.println(wartoscTekstowa(124_429_872_167L));
		System.out.println(wartoscTekstowa(126_429_872_847L));
		System.out.println(wartoscTekstowa(545_429_872_009L));
		System.out.println(wartoscTekstowa(666_429_872_000L));
		System.out.println(wartoscTekstowa(999_429_872_601L));

	}

}
