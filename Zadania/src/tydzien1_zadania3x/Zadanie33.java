package tydzien1_zadania3x;

public class Zadanie33 {

	public static void main(String[] args) {

//		System.out.println(wartoscTekstowa(39));
//		System.out.println(wartoscTekstowa(56));
//		System.out.println(wartoscTekstowa(89));
//		System.out.println(wartoscTekstowa(99));
//		System.out.println(wartoscTekstowa(100));
//		System.out.println(wartoscTekstowa(102));
//		System.out.println(wartoscTekstowa(110));
//		System.out.println(wartoscTekstowa(116));
//		System.out.println(wartoscTekstowa(121));
//		System.out.println(wartoscTekstowa(122));
//		System.out.println(wartoscTekstowa(123));
//		System.out.println(wartoscTekstowa(124));
//		System.out.println(wartoscTekstowa(147));
//		System.out.println(wartoscTekstowa(168));
//		System.out.println(wartoscTekstowa(199));
//		System.out.println(wartoscTekstowa(200));
//		System.out.println(wartoscTekstowa(202));
//		System.out.println(wartoscTekstowa(210));
//		System.out.println(wartoscTekstowa(216));
//		System.out.println(wartoscTekstowa(299));
//		System.out.println(wartoscTekstowa(324));
//		System.out.println(wartoscTekstowa(368));
//		System.out.println(wartoscTekstowa(447));

		
//		System.out.println(wartoscTekstowa(3123));
//		System.out.println(wartoscTekstowa(4123));
//		System.out.println(wartoscTekstowa(5123));
//		System.out.println(wartoscTekstowa(6123));
//		System.out.println(wartoscTekstowa(7123));
//		System.out.println(wartoscTekstowa(8123));
//		System.out.println(wartoscTekstowa(9123));
//		System.out.println(wartoscTekstowa(10123));
//		System.out.println(wartoscTekstowa(11123));
//		System.out.println(wartoscTekstowa(12123));
//		System.out.println(wartoscTekstowa(21123));
		
		System.out.println(wartoscTekstowa(101123));
		System.out.println(wartoscTekstowa(303123));
		System.out.println(wartoscTekstowa(413123));
		System.out.println(wartoscTekstowa(512123));
		System.out.println(wartoscTekstowa(619123));
		System.out.println(wartoscTekstowa(901123));
		System.out.println(wartoscTekstowa(983723));
		System.out.println(wartoscTekstowa(985555));
		System.out.println(wartoscTekstowa(999123));
		
//		System.out.println(wartoscTekstowa(01123));			//Błąd bo zero na początku - dziwnie czyta liczbe - do sprawdzenia
//		System.out.println(wartoscTekstowa(1123));
		
//		System.out.println(wartoscTekstowa(1000000));
//		System.out.println(wartoscTekstowa(1000001));
//		System.out.println(wartoscTekstowa(1100000));
//		System.out.println(wartoscTekstowa(1111111));
//		System.out.println(wartoscTekstowa(1231567));
//		System.out.println(wartoscTekstowa(1232567));
//		System.out.println(wartoscTekstowa(1233567));
//		System.out.println(wartoscTekstowa(1234567));
//		System.out.println(wartoscTekstowa(2000000));
//		System.out.println(wartoscTekstowa(2000354));
//		System.out.println(wartoscTekstowa(2425562));
//		System.out.println(wartoscTekstowa(12429872));
//		System.out.println(wartoscTekstowa(14429872));
//		System.out.println(wartoscTekstowa(15829872));
//		System.out.println(wartoscTekstowa(20429872));
//		System.out.println(wartoscTekstowa(21429872));
//		System.out.println(wartoscTekstowa(88429872));
		
//		System.out.println(wartoscTekstowa(112429872));
//		System.out.println(wartoscTekstowa(107429872));
//		System.out.println(wartoscTekstowa(103429872));
//		System.out.println(wartoscTekstowa(105429872));
//		System.out.println(wartoscTekstowa(114429872));
//		System.out.println(wartoscTekstowa(117429872));
//		System.out.println(wartoscTekstowa(119429872));
//		System.out.println(wartoscTekstowa(120429872));
//		System.out.println(wartoscTekstowa(124429872));
//		System.out.println(wartoscTekstowa(126429872));
//		System.out.println(wartoscTekstowa(545429872));
//		System.out.println(wartoscTekstowa(666429872));
//		System.out.println(wartoscTekstowa(999429872));
	}

	public static String wartoscTekstowa(long liczba) {

		String liczbaTekstowo = "";

//		String tysiace[] = { "zero", "tysiąc ", "dwa tysiące ", "trzy tysiące ", "czterysta ", "pięćset ", "sześćset ", "siedemset ",
//				"osiemset ", "dziewięćset " };

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

		String tmp = String.valueOf(liczba).substring(0, 1);
		// Zabezpieczenie przed zerem na początku long'a
//		if (tmp.equals("0")) {
//			System.out.println("Błędna wartość liczby. Liczba nie może zaczynac sie od zera.");
//		}

		if (liczba < 0) {
			String liczbaString = "" + liczba;
			liczbaString = liczbaString.substring(1);
			return "minus " + wartoscTekstowa(Long.parseLong(liczbaString));
		}

		if ((liczba / 1_000_000) > 0) {
			
			int wynik = dobierzPrzedrostek(liczba, 1_000_000);
			String wynikStr = Integer.toString(wynik);
			int ostatniaCyfra = Integer.parseInt(wynikStr.substring(wynikStr.length()-1,wynikStr.length()));
			
			if (wynik == 1) {
				liczbaTekstowo += "milion ";
			} else if (wynik > 1 && wynik < 5) {
				liczbaTekstowo += ponizej20[wynik] + " miliony ";
			}else if (ostatniaCyfra > 1 && ostatniaCyfra < 5) {
				liczbaTekstowo += wartoscTekstowa(liczba / 1000_000) + " tysiące ";
			}else if (wynik >= 5) {
				liczbaTekstowo += wartoscTekstowa(liczba / 1000_000) + " milionów ";
			}
			liczba %= 1_000_000;
		}

		if ((liczba / 1_000) > 0) {
			int wynik = dobierzPrzedrostek(liczba, 1000);
			String wynikStr = Integer.toString( (((int)liczba/1000) %100) );
			int ostatniaCyfra = Integer.parseInt(wynikStr.substring(wynikStr.length()-1,wynikStr.length()));
			
			if (wynik == 1) {
				liczbaTekstowo += "tysiąc ";
			} else if (wynik > 1 && wynik < 5) {
				liczbaTekstowo += ponizej20[wynik] + " tysiące ";
//				liczbaTekstowo += wartoscTekstowa(liczba / 1000) + " tysiące ";
			}else if ( (ostatniaCyfra == 2 || ostatniaCyfra == 3 || ostatniaCyfra == 4 )) {
				liczbaTekstowo += wartoscTekstowa(liczba / 1000) + " tysiące ";
			}else if (wynik >= 5  ) {
				liczbaTekstowo += wartoscTekstowa(liczba / 1000) + " tysięcy ";
			}

			liczba %= 1_000;
		}

		if ((liczba / 100) > 0) {
			liczbaTekstowo += setki[dobierzPrzedrostek(liczba, 100)];
			// wartoscTekstowa(liczba/100) + "setek";
			liczba %= 100;
		}

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

	public static int dobierzPrzedrostek(long liczba, int dzielnik) {

		int wyn = (int) liczba / dzielnik;

		return wyn;
//		if ((liczba / dzielnik) >= 9) {
//			return 9;
//		} else if ((liczba / dzielnik) >= 8) {
//			return 8;
//		} else if ((liczba / dzielnik) >= 7) {
//			return 7;
//		} else if ((liczba / dzielnik) >= 6) {
//			return 6;
//		} else if ((liczba / dzielnik) >= 5) {
//			return 5;
//		} else if ((liczba / dzielnik) >= 4) {
//			return 4;
//		} else if ((liczba / dzielnik) >= 3) {
//			return 3;
//		} else if ((liczba / dzielnik) >= 2) {
//			return 2;
//		} else if ((liczba / dzielnik) >= 1) {
//			return 1;
//		}
//		return 0;
	}

}
